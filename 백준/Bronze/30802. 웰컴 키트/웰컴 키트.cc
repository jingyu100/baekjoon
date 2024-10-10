#include <stdio.h>

int n, list[6], p, t, tcnt;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < 6; ++i) {
        scanf("%d", &list[i]);
    }
    scanf("%d%d", &t, &p);
    for (int i = 0; i < 6; ++i) {
        if (list[i] % t > 0) tcnt += list[i] / t + 1;
        else tcnt += list[i] / t;
    }
    printf("%d\n", tcnt);
    printf("%d %d", n / p, n % p);
    return 0;
}
