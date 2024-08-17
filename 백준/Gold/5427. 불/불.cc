#define M 1001
#include <algorithm>
#include <cstring>
#include <stdio.h>

char input[M][M];
int qx[M * M], qy[M * M], node[M][M], firenode[M][M];
int zx[4] = {1, -1, 0, 0}, zy[4] = {0, 0, 1, -1};
int t, w, h, iidx = -1, oidx = -1, x, y, rx, ry, ans, cnt;
bool escape;

void fire() {
    iidx = cnt - 1, oidx = -1;
    for (int i = 0; i < cnt; ++i) {
        firenode[qx[i]][qy[i]] = 1;
    }
    while (iidx != oidx) {
        x = qx[++oidx];
        y = qy[oidx];
        for (int i = 0; i < 4; i++) {
            int nx = x + zx[i];
            int ny = y + zy[i];
            if (nx >= 0 && nx < h && ny >= 0 && ny < w && input[nx][ny] != '#' && firenode[nx][ny] == 0) {
                qx[++iidx] = nx;
                qy[iidx] = ny;
                firenode[nx][ny] = firenode[x][y] + 1;
            }
        }
    }
}

void sanggeun(int a, int b) {
    iidx = 0, oidx = -1;
    qx[iidx] = a;
    qy[iidx] = b;
    node[a][b] = 1;
    while (iidx != oidx) {
        x = qx[++oidx];
        y = qy[oidx];
        for (int i = 0; i < 4; i++) {
            int nx = x + zx[i];
            int ny = y + zy[i];
            if ((nx < 0 || nx >= h || ny < 0 || ny >= w) && (node[x][y] < firenode[x][y] || firenode[x][y] == 0)) {
                ans = node[x][y];
                escape = true;
                return;
            }
            if (nx >= 0 && nx < h && ny >= 0 && ny < w && input[nx][ny] == '.' && node[nx][ny] == 0 && (node[x][y] + 1 < firenode[nx][ny] || firenode[x][y] == 0)) {
                qx[++iidx] = nx;
                qy[iidx] = ny;
                node[nx][ny] = node[x][y] + 1;
            }
        }
    }
}

int main() {
    scanf("%d", &t);
    for (int i = 0; i < t; ++i) {
        memset(input, 0, sizeof(input));
        memset(node, 0, sizeof(node));
        memset(firenode, 0, sizeof(firenode));
        iidx = -1, oidx = -1, ans = 0, escape = false, cnt = 0;
        scanf("%d%d", &w, &h);
        for (int j = 0; j < h; ++j) {
            scanf("%s", input[j]);
            for (int k = 0; k < w; ++k) {
                if (input[j][k] == '*') {
                    qx[++iidx] = j;
                    qy[iidx] = k;
                    cnt++;
                } else if (input[j][k] == '@') {
                    rx = j;
                    ry = k;
                }
            }
        }
        fire();
        sanggeun(rx, ry);
        if (escape) printf("%d\n", ans);
        else
            printf("IMPOSSIBLE\n");
    }
    return 0;
}
