#include <algorithm>
#include <stdio.h>
#include <queue>
#include <vector>
#include <cstring>

using namespace std;

vector<int> vec[501], revvec[501];
int n, m, a, b, ans, check[501], cnt, revcnt;

void func(int x) {
    memset(check, 0, sizeof(check));
    queue<int> q;
    q.push(x);
    check[x] = 1;
    while (!q.empty()) {
        int d = q.front();
        q.pop();
        for (int i = 0; i < vec[d].size(); ++i) {
            int next = vec[d][i];
            if (!check[next]) {
                check[next] = 1;
                q.push(next);
            }
        }
    }
}

void revfunc(int x) {
    memset(check, 0, sizeof(check));
    queue<int> q;
    q.push(x);
    check[x] = 1;
    while (!q.empty()) {
        int d = q.front();
        q.pop();
        for (int i = 0; i < revvec[d].size(); ++i) {
            int next = revvec[d][i];
            if (!check[next]) {
                check[next] = 1;
                q.push(next);
            }
        }
    }
}

int main() {
    scanf("%d%d", &n, &m);
    for (int i = 0; i < m; ++i) {
        scanf("%d%d", &a, &b);
        vec[a].push_back(b);
        revvec[b].push_back(a);
    }
    for (int i = 1; i <= n; ++i) {
        memset(check, 0, sizeof(check));
        func(i);
        for (int j = 1; j <= n; ++j) {
            if (check[j]) cnt++;
        }
        memset(check, 0, sizeof(check));
        revfunc(i);
        for (int j = 1; j <= n; ++j) {
            if (check[j]) revcnt++;
        }
        if (cnt + revcnt - 1 == n) ans++;
        cnt = 0;
        revcnt = 0;
    }
    printf("%d\n", ans);
    return 0;
}
