#include <algorithm>
#include <stdio.h>
using namespace std;

int qx[101];
int node[101 * 101];
int chk[101];
int relation[101][101];

int main() {
    int n, start, end, m;
    scanf("%d%d%d%d", &n, &start, &end, &m);
    for (int i = 0; i < m; ++i) {
        int x, y;
        scanf("%d%d", &x, &y);
        relation[x][y] = relation[y][x] = 1;
    }
    int iidx = 0, oidx = 0;
    qx[iidx++] = start;
    chk[start] = 1;
    bool found = false;
    while (oidx < iidx) {
        int now = qx[oidx++];
        if (now == end) {
            found = true;
            break;
        }
        for (int i = 1; i <= n; ++i) {
            if (relation[now][i] == 1 && chk[i] == 0) {
                qx[iidx++] = i;
                chk[i] = 1;
                node[i] = node[now] + 1;
            }
        }
    }
    if (found) printf("%d\n", node[end]);
    else
        printf("-1\n");


    return 0;
}
