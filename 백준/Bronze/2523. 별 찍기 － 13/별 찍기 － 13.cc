#include <stdio.h>

int n, cnt;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < 2 * n - 1; ++i) {
        if (i >= n) {
            cnt--;
            for (int k = 0; k < cnt; ++k) {
                printf("*");
            }
        } else {
            cnt++;
            for (int k = 0; k < cnt; ++k) {
                printf("*");
            }
        }
        printf("\n");
    }
    return 0;
}