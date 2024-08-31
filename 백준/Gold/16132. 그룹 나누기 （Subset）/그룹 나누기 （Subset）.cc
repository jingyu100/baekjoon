#include <stdio.h>
#include <algorithm>

using namespace std;

long long int sum, list[10000], n;

int main() {
    scanf("%lld", &n);
    if ((n * (n + 1) / 2) % 2 == 1) {
        printf("0");
        exit(0);
    }
    sum = (n * (n + 1) / 2) / 2;
    list[0] = 1;
    for (long long int i = 1; i <= n; ++i) {
        for (long long int j = sum; j >= i; --j) {
            list[j] += list[j - i];
        }
    }
    printf("%lld", list[sum] / 2);
    return 0;
}
