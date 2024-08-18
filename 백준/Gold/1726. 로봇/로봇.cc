#include <algorithm>
#include <queue>
#include <stdio.h>
using namespace std;

int zx[4] = {0, 0, 1, -1}, zy[4] = {1, -1, 0, 0};
int input[101][101];
int chk[101][101][4];
int way[4][2] = {2, 3, 2, 3, 0, 1, 0, 1};
int startx, starty, startway, endx, endy, endway, n, m;
struct tmp {
    int x, y, w;
} t;
queue<tmp> q;
int x, y, w, nx, ny;

void func() {
    t.x = startx - 1, t.y = starty - 1, t.w = startway - 1;
    chk[t.x][t.y][t.w] = 0;
    q.push(t);
    while (!q.empty()) {
        t = q.front();
        q.pop();
        x = t.x, y = t.y, w = t.w;
        if (x == endx - 1 && y == endy - 1 && w == endway - 1) break;
        for (int i = 0; i < 2; ++i) {
            if (chk[x][y][way[w][i]] == 0) {
                chk[x][y][way[w][i]] = chk[x][y][w] + 1;
                t.x = x;
                t.y = y;
                t.w = way[w][i];
                q.push(t);
            }
        }
        for (int j = 1; j <= 3; ++j) {
            nx = x + zx[w] * j;
            ny = y + zy[w] * j;
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || input[nx][ny] == 1) break;
            if (input[nx][ny] == 0 && chk[nx][ny][w] == 0) {
                chk[nx][ny][w] = chk[x][y][w] + 1;
                t.x = nx;
                t.y = ny;
                t.w = w;
                q.push(t);
            }
        }
    }
}

int main() {
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            scanf("%d", &input[i][j]);
        }
    }
    scanf("%d%d%d", &startx, &starty, &startway);
    scanf("%d%d%d", &endx, &endy, &endway);
    func();
    printf("%d\n", chk[endx - 1][endy - 1][endway - 1]);
    return 0;
}