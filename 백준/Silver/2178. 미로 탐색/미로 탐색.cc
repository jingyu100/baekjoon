#include <stdio.h>

int input[101][101];
int node[10001];
struct temp {
    int x, y;
} list[10001];

int main() {
    int n, m, inputidx = 0, outputidx = 0;
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            scanf("%1d", &input[i][j]);
        }
    }
    list[0].x = 0;
    list[0].y = 0;
    input[0][0] = 0;
    while (1) {
        if(n == 0 && m == 0) {
            printf("0");
            return 0;
        }
        if (input[list[outputidx].x + 1][list[outputidx].y] == 1) {
            list[++inputidx].x = list[outputidx].x + 1;
            list[inputidx].y = list[outputidx].y;
            input[list[outputidx].x + 1][list[outputidx].y] = 0;
            node[inputidx] = node[outputidx] + 1;
            if(list[inputidx].x == n -1  && list[inputidx].y == m -1) {
                printf("%d",node[inputidx] + 1);
                return 0;
            }
        }
        if (input[list[outputidx].x - 1][list[outputidx].y] == 1) {
            list[++inputidx].x = list[outputidx].x - 1;
            list[inputidx].y = list[outputidx].y;
            input[list[outputidx].x - 1][list[outputidx].y] = 0;
            node[inputidx] = node[outputidx] + 1;
            if(list[inputidx].x == n -1  && list[inputidx].y == m -1) {
                printf("%d",node[inputidx] + 1);
                return 0;
            }
        }
        if (input[list[outputidx].x][list[outputidx].y + 1] == 1) {
            list[++inputidx].x = list[outputidx].x;
            list[inputidx].y = list[outputidx].y + 1;
            input[list[outputidx].x][list[outputidx].y + 1] = 0;
            node[inputidx] = node[outputidx] + 1;
            if(list[inputidx].x == n -1  && list[inputidx].y == m -1) {
                printf("%d",node[inputidx] + 1);
                return 0;
            }
        }
        if (input[list[outputidx].x][list[outputidx].y - 1] == 1) {
            list[++inputidx].x = list[outputidx].x;
            list[inputidx].y = list[outputidx].y - 1;
            input[list[outputidx].x][list[outputidx].y - 1] = 0;
            node[inputidx] = node[outputidx] + 1;
            if(list[inputidx].x == n -1  && list[inputidx].y == m -1) {
                printf("%d",node[inputidx] + 1);
                return 0;
            }
        }
        outputidx++;
    }
    return 0;
}
