#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

int n, ans, cnt;
char ch;
stack<char> st;

int main() {
    scanf("%d", &n);
    scanf("%c", &ch);
    for (int i = 0; i < n; ++i) {
        scanf("%c", &ch);
        if (st.empty() || st.top() == ch) {
            st.push(ch);
        } else {
            st.pop();
        }
        ans = max(ans, (int)st.size());
    }
    if (!st.empty()) printf("-1");
    else printf("%d", ans);
}

