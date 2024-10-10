#include <stdio.h>
#include <string>
#include <algorithm>

int i, t, s, n, t1, cnt;

int main() {
    scanf("%d", &n);
    i = 665;
    while (1) {
        t = i;
        s = i;
        while (s > 0) {
            t = s % 10;
            if (t == 6) {
                t = s / 10 % 10;
                if (t == 6) {
                    t = s / 100 % 10;
                    if (t == 6) {
                        t1 = s / 1000 % 10;
                        cnt++;
                        if (n == cnt) {
                            printf("%d", i);
                            return 0;
                        }
                    }
                }
            }
            if (t1 == 6) i++;
            s = s / 10;
        }
        i++;
    }
}