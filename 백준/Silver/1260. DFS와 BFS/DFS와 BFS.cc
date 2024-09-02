#include <algorithm>
#include <stdio.h>
#include <stack>
#include <memory.h>
#include <queue>

using namespace std;

int n, m, v, a, b, list[1001][1001], chk1[1001];
queue<int> q;

void dfs(int x) {
    printf("%d ", x);
    for (int i = 1; i < n + 1; ++i) {
        if (list[x][i] && !chk1[i]) {
            chk1[i] = 1;
            dfs(i);
        }
    }
}

void bfs(int x) {
    queue<int> q;
    q.push(x);
    chk1[x] = 1;
    while (!q.empty()) {
        int p = q.front();
        q.pop();
        printf("%d ", p);
        for (int i = 1; i < n + 1; ++i) {
            if (list[p][i] && !chk1[i]) {
                chk1[i] = 1;
                q.push(i);
            }
        }
    }
}

int main() {
    scanf("%d%d%d", &n, &m, &v);
    for (int i = 0; i < m; ++i) {
        scanf("%d%d", &a, &b);
        list[a][b] = 1;
        list[b][a] = 1;
    }
    chk1[v] = 1;
    dfs(v);
    fill(chk1, chk1 + 1001, 0);
    printf("\n");
    chk1[v] = 1;
    bfs(v);
    return 0;
}
