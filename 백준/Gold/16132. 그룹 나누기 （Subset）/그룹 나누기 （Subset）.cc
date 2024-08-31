#include <stdio.h>
#include <algorithm>

using namespace std;

int n, list[1300], sum;

int main() {
    scanf("%d", &n);
    if((n * (n + 1) / 2) % 2 == 1) {
        printf("0");
        exit(0);
    }
    sum = (n * (n + 1) / 2) / 2;
    list[0] = 1;
    for (int i = 1; i <= n; ++i) {
        for (int j = sum; j >= i; --j) {
            list[j] += list[j - i];
        }
    }
    printf("%d\n", list[sum] / 2);
    return 0;
}
