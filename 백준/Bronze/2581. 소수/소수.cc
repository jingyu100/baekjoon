#include <algorithm>
#include <stdio.h>
using namespace std;

int check[10001];

int main() {
    int n, m;
    int ans = 0;
    int min1 = 10000;
    scanf("%d%d", &n, &m);
    for (int i = 2; i <= 10000; i++) {
        if (check[i] == 2) continue;
        else
            check[i] = 1;
        for (int j = i + i; j <= 10000; j += i) {
            check[j] = 2;
        }
    }
    for (int i = n; i <= m; i++) {
        if (check[i] == 1) {
            min1 = min(min1, i);
            ans += i;
        }
    }
    if (ans == 0) printf("-1");
    else {
        printf("%d\n", ans);
        printf("%d", min1);
    }
}