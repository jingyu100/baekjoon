#include <stdio.h>
#include <algorithm>
#include <vector>

using namespace std;

int n, k, ans = 1;

int main() {
    scanf("%d %d", &n, &k);
    for (int i = 0; i < k; i++) {
        ans *= n;
        n--;
    }
    for (int i = k; i > 0; i--) {
        ans /= i;
    }
    printf("%d", ans);
    return 0;
}

