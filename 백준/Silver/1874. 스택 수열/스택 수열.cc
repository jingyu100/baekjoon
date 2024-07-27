#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

stack<int> st;
int list[100000];
char ans[100000];
int anscnt;

int main() {
    int n, index = 0, cnt = 1, h = 0;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &list[i]);
    }
    while (1) {
        if (index >= n) break;
        if (cnt > n+1) {
            h = 1;
            break;
        }
        if (st.empty() || st.top() != list[index]) {
            st.push(cnt++);
            ans[anscnt++] = '+';
        } else {
            st.pop();
            ans[anscnt++] = '-';
            index++;
        }
    }
    if(h) printf("NO");
    else
        for (int i = 0; i < anscnt; ++i) {
            if(i == anscnt-1) printf("%c",ans[i]);
            else printf("%c\n",ans[i]);
        }
    return 0;
}