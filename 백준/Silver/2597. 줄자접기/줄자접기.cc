#include <algorithm>
#include <stdio.h>
 
using namespace std;
 
double a[6], l, r, mid;
 
int main() {
    int i, j;
    scanf("%lf", &r);// 10
    for (i = 0; i < 6; i++)
        scanf("%lf", &a[i]);
    for (i = 0; i < 6; i += 2) {
        if (a[i] == a[i + 1]) continue;
        mid = (a[i] + a[i + 1]) / 2;
        if (mid - l > r - mid) {
            r = mid;
            for (j = i + 2; j < 6; j++)
                if (a[j] > mid) a[j] = mid - (a[j] - mid);
        } else {
            l = mid;
            for (j = i + 2; j < 6; j++)
                if (a[j] < mid) a[j] = mid + (mid - a[j]);
        }
    }
    printf("%.1lf", r - l);
    return 0;
}