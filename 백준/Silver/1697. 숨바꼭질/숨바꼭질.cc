#include <stdio.h>

int list[100011];
int node[100011];
int check[100011];

int main() {
    int n, k, inputidx = 0, outputidx = 0;
    scanf("%d%d", &n, &k);
    if (k == n) {
        printf("0");
        return 0;
    }
    list[0] = n;
    node[0] = 1;
    while (1) {
        int now = list[outputidx++];
        if (now - 1 >= 0 && check[now - 1] == 0) {
            list[++inputidx] = now - 1;
            node[inputidx] = node[outputidx - 1] + 1;
            check[now - 1] = 1;
            if (now - 1 == k) {
                printf("%d", node[inputidx] - 1);
                return 0;
            }
        }
        if (now + 1 <= 100000 && check[now + 1] == 0) {
            list[++inputidx] = now + 1;
            node[inputidx] = node[outputidx - 1] + 1;
            check[now + 1] = 1;
            if (now + 1 == k) {
                printf("%d", node[inputidx] - 1);
                return 0;
            }
        }
        if (now * 2 <= 100000 && check[now * 2] == 0) {
            list[++inputidx] = now * 2;
            node[inputidx] = node[outputidx - 1] + 1;
            check[now * 2] = 1;
            if (now * 2 == k) {
                printf("%d", node[inputidx] - 1);
                return 0;
            }
        }
    }
    return 0;
}