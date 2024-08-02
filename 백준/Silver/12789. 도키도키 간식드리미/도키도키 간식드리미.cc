#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

stack<int> st;

int main() {
    int n,cnt=1;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        int num;
        scanf("%d",&num);
        st.push(num);
        while(1) {
            if(st.empty()) break;
            if(st.top() == cnt) {
                st.pop();
                cnt++;
            } else {
                break;
            }
        }
    }
    if(st.empty()) printf("Nice");
    else printf("Sad");
    return 0;
}