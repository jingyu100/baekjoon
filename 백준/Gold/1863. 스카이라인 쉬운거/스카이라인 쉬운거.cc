#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

stack<int> st;

int main() {
    int n, x, y, cnt = 0;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d", &x, &y);
        while (!st.empty() && st.top() > y) {
            st.pop();
            cnt++;
        }
        if (st.empty() || st.top() != y) st.push(y);
    }
    while (!st.empty() && st.top() != 0) {
        st.pop();
        cnt++;
    }
    printf("%d", cnt);
    return 0;
}
