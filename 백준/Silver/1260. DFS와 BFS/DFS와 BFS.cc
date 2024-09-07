#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 6031)

#include <algorithm>
#include <stdio.h>
#include <stack>
#include <memory.h>
#include <queue>
#include <string>
#include <vector>

using namespace std;

int n, m, v, a, b;
vector<int> vec[1001];
queue<int> q;
int dfschk[1001], bfschk[1001];

void dfs(int x) {
    printf("%d ", x);
    dfschk[x] = 1;
    for (int i = 0; i < vec[x].size(); ++i) {
        int next = vec[x][i];
        if (!dfschk[next]) {
            dfs(next);
        }
    }
}

void bfs(int x) {
    q.push(x);
    bfschk[x] = 1;
    while (!q.empty()) {
        int d = q.front();
        printf("%d ", d);
        q.pop();
        for (int i = 0; i < vec[d].size(); ++i) {
            int next = vec[d][i];
            if (!bfschk[next]) {
                q.push(next);
                bfschk[next] = 1;
            }
        }
    }
}

int main() {
    scanf("%d%d%d", &n, &m, &v);
    for (int i = 0; i < m; ++i) {
        scanf("%d%d", &a, &b);
        vec[a].push_back(b);
        vec[b].push_back(a);
    }
    for (int i = 1; i <= n; ++i) {
        sort(vec[i].begin(), vec[i].end());
    }
    dfs(v);
    printf("\n");
    bfs(v);
    return 0;
}
