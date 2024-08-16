#include <algorithm>
#include <stdio.h>
 
using namespace std;
 
int list[100001], n, k;
 
bool func(int mid) {
    long long cnt = 0;
    for (int i = 0; i < n; ++i) {
        if (list[i] > mid) {
            cnt += (list[i] - mid + k - 1) / k;
        }
    }
    if(cnt <= mid) return true;
    else return false;
}
 
int main() {
    int ans = 0;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &list[i]);
    }
    scanf("%d", &k);
    k-=1;
    if(k==0) {
        printf("%d",list[n-1]);
        return 0;
    }
    sort(list, list + n);
    int left = 0, right = list[n - 1], mid;
    while (1) {
        if (left > right) break;
        mid = (left + right) / 2;
        if (func(mid)) {
            ans = mid;
            right = mid - 1;
        } else
            left = mid + 1;
    }
    printf("%d", ans);
    return 0;
}