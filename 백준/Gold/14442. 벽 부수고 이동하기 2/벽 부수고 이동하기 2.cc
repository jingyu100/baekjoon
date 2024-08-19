#include <algorithm>
#include <queue>
#include <stdio.h>
using namespace std;

#define MAXN 1000
struct temp {
    int x, y, d;
} t;
int N, M, K, map[MAXN][MAXN], chk[11][MAXN][MAXN], dab = -1;
int zx[4] = {1, -1, 0, 0}, zy[4] = {0, 0, 1, -1};
queue<temp> q;

void BFS() {
    int i, nx, ny, x, y, d;
    t.x = 0;
    t.y = 0;
    t.d = 0;
    chk[0][0][0] = 1;
    q.push(t);
    while (!q.empty()) {
        t = q.front();
        q.pop();
        x = t.x;
        y = t.y;
        d = t.d;
        if (x == N - 1 && y == M - 1) {
            dab = chk[d][x][y];
            break;
        }
        for (i = 0; i < 4; i++) {
            nx = x + zx[i];
            ny = y + zy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
            if (map[nx][ny] == 0 && chk[d][nx][ny] == 0) {
                t.x = nx;
                t.y = ny;
                t.d = d;
                q.push(t);
                chk[d][nx][ny] = chk[d][x][y] + 1;
            }
            if (map[nx][ny] == 1 && d + 1 <= K && chk[d + 1][nx][ny] == 0) {
                t.x = nx;
                t.y = ny;
                t.d = d + 1;
                q.push(t);
                chk[d + 1][nx][ny] = chk[d][x][y] + 1;
            }
        }
    }
}
int main() {
    int i, j;

    scanf("%d%d%d", &N, &M, &K);
    for (i = 0; i < N; i++) {
        for (j = 0; j < M; j++) {
            scanf("%1d", &map[i][j]);
        }
    }
    BFS();
    printf("%d\n", dab);

    return 0;
}