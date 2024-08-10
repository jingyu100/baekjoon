#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int list[100000];

int main() {
    int n, m;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &list[i]);
    }
    sort(list, list + n);
    int chk;
    scanf("%d", &m);
    for (int i = 0; i < m; ++i) {
        int left = 0, right = n - 1, mid;
        scanf("%d", &chk);
        while(1) {
            if(left > right) {
                printf("0\n");
                break;
            }
            mid = (left + right) / 2 ;
            if (chk == list[mid]) {
                printf("1\n");
                break;
            }
            if (chk > list[mid]) {
                left = mid+1;
            } else
                right = mid - 1;
        }
    }
    return 0;
}
