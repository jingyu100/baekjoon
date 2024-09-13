#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

int n, p, a, b, ans;
stack<int> st[300001];

int main() {
    scanf("%d%d", &n, &p);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d", &a, &b);
        while (!st[a].empty() && st[a].top() > b) {
            st[a].pop();
            ans++;
        }
        if (st[a].empty() || st[a].top() != b) {
            st[a].push(b);
            ans++;
        }
    }
    printf("%d", ans);
}
