#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>
using namespace std;

int zx[4] = {1, -1, 0, 0}, zy[4] = {0, 0, 1, -1};
int input[101][101], check[101][101];
int n, m, x, y;

void func(int a, int b) {
    int qx[10001] = {0};
    int qy[10001] = {0};
    check[0][0] = 1;
    int iidx = 0;
    int oidx = -1;
    while (1) {
        if (iidx <= oidx) return;
        x = qx[++oidx];
        y = qy[oidx];
        for (int k = 0; k < 4; ++k) {
            if (x + zx[k] >= 0 && x + zx[k] < n && y + zy[k] >= 0 && y + zy[k] < m && input[x + zx[k]][y + zy[k]] == 1 && check[x + zx[k]][y + zy[k]] == 0) {
                check[x + zx[k]][y + zy[k]] = 1;
                qx[++iidx] = x + zx[k];
                qy[iidx] = y + zy[k];
            } else if(x + zx[k] >= 0 && x + zx[k] < n && y + zy[k] >= 0 && y + zy[k] < m && input[x + zx[k]][y + zy[k]] == 2){
                check[x + zx[k]][y + zy[k]]++;
            }
        }
    }
}

int main() {
    int ans = 0;
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            int tmp;
            scanf("%d", &tmp);
            if (tmp == 0) input[i][j] = 1;
            else
                input[i][j] = 2;
        }
    }
    while (1) {
        int cnt = 0;
        func(0, 0);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (check[i][j] >= 2) {
                    cnt++;
                    input[i][j] = 1;
                    check[i][j] = 0;
                } else check[i][j] = 0;
            }
        }
        if (cnt == 0) break;
        else
            ans++;
    }
    printf("%d", ans);
    return 0;
}