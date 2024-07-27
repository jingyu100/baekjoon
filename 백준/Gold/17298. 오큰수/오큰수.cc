#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int input[1000001];
int ans[1000001];
stack<int> st;

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &input[i]);
    }
    for (int i = 0; i < n; i++) {
        while (!st.empty() && input[st.top()] < input[i]) {
            ans[st.top()] = input[i];
            st.pop();
        }
        st.push(i);
    }
    while (!st.empty()) {
        ans[st.top()] = -1;
        st.pop();
    }
    for (int i = 0; i < n; i++) {
        printf("%d ", ans[i]);
    }
    return 0;
}