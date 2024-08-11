#include <algorithm>
#include <stdio.h>

using namespace std;

int v[10001], dab;

int main() {
    int n, m;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &v[i]);
    }
    sort(v,v+n);
    scanf("%d", &m);
    int l = 0, r = v[n - 1], mid, sw;
    while (1) {
        if (l > r) break;
        sw = 0;
        mid = (l + r) / 2;
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            if (v[i] > mid) sum += mid;
            else
                sum += v[i];
        }
        if (sum <= m) {
            sw = 1;
            if(mid > dab) dab = mid;
//            dab = mid;
        }
        if (sw == 1) l = mid + 1;
        else
            r = mid - 1;
    }
    printf("%d", dab);
    return 0;
}
