#include <algorithm>
#include <stdio.h>

using namespace std;

int list[200001], dab;

int main() {
    int n, c;
    scanf("%d%d", &n, &c);
    for (int i = 0; i < n; i++) {
        scanf("%d", &list[i]);
    }
    sort(list, list + n);
    int l = 1, r = list[n - 1], mid;
    while (1) {
        if(l > r) break;
        mid = (l + r) / 2;
        int chk = list[0], cnt = 1;
        for (int i = 1; i < n; ++i) {
            if (list[i] >= chk + mid) {
                chk = list[i];
                cnt++;
            }
        }
        if (cnt >= c) {
            dab = mid;
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    printf("%d\n", dab);
    return 0;
}