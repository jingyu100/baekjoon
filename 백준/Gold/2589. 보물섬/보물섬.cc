#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>
using namespace std;

int zx[4] = {1, -1, 0, 0};
int zy[4] = {0, 0, 1, -1};
char input[51][51];


int main() {
    int n, m, max = 0;
    char tmp;
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; ++i) {
        scanf("%c", &tmp);
        for (int j = 0; j < m; ++j) {
            scanf("%c", &input[i][j]);
        }
    }
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            if (input[i][j] == 'L') {
                int iidx = 0, oidx = -1, check[51][51]={0}, node[251]={0}, qx[251]={0}, qy[251]={0};
                qx[iidx] = i, qy[iidx] = j;
                check[i][j] = 1;
                while (1) {
                    if (iidx == oidx) break;
                    int x = qx[++oidx], y = qy[oidx];
                    for (int k = 0; k < 4; ++k) {
                        if (x + zx[k] >= 0 && x + zx[k] < n && y + zy[k] >= 0 && y + zy[k] < m && input[x + zx[k]][y + zy[k]] == 'L' && check[x + zx[k]][y + zy[k]] == 0) {
                            qx[++iidx] = x + zx[k];
                            qy[iidx] = y + zy[k];
                            check[qx[iidx]][qy[iidx]] = 1;
                            node[iidx] = node[oidx] + 1;
                           if (node[iidx] > max) max = node[iidx];
                        }
                    }
                }
            }
        }
    }
    printf("%d", max);
    return 0;
}