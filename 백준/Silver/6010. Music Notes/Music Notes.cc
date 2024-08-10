#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int list[100000];

int main() {
    int n, q, b, sum = 0, t;
    scanf("%d%d", &n, &q);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &b);
        sum += b;
        list[i] = sum - 1;
    }
    for (int i = 0; i < q; ++i) {
        int left = 0, right = n - 1, mid;
        scanf("%d", &t);
        while(1) {
            mid = (left + right) / 2;
            if(left > right) {
                printf("%d\n",left+1);
                break;
            }
            if (list[mid] == t) {
                printf("%d\n", mid+1);
                break;
            } else if (list[mid] < t)
                left = mid + 1;
            else
                right = mid - 1;
        }
    }
    return 0;
}
