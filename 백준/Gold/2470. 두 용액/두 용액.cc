#include <algorithm>
#include <stdio.h>

using namespace std;

int v[1000100], l, r, sum, n, a, mi = 0x7fffffff, c1, c2, s1, s2;

bool com(int i, int j) {
    return i < j;
}

int main() {
    int i;
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
        scanf("%d", &v[i]);
    sort(v + 1, v + n + 1, com);
    for (i = 1; i <= n; i++) {
        a = -v[i];
        l = i + 1;
        r = n;
        while (1) {
            if (l > r) break;
            sum = (l + r) / 2;
            if (v[sum] == a) {
                printf("%d %d", v[i], a);
                exit(0);
            }
            if (v[sum] < a) l = sum + 1;
            else
                r = sum - 1;
        }
        c1 = v[i] + v[l];
        if (c1 < 0) c1 *= -1;
        if (l <= n && mi > c1) {
            mi = c1;
            s1 = v[i];
            s2 = v[l];
        }
        c2 = v[i] + v[r];
        if (c2 < 0) c2 *= -1;
        if (r > i && mi > c2) {
            mi = c2;
            s1 = v[i];
            s2 = v[r];
        }
    }
    printf("%d %d", s1, s2);
    return 0;
}
