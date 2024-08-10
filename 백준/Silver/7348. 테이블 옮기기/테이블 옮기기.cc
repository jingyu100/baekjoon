#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

struct temp {
    int a, b;
} list[401];

bool func(temp a, temp b) {
    return a.a < b.a;
}

int main() {
    int t, n;
    scanf("%d", &t);
    for (int i = 0; i < t; ++i) {
        int check[401] = {0};
        scanf("%d", &n);
        for (int j = 0; j < n; ++j) {
            int a, b;
            scanf("%d%d", &a, &b);
            list[j].a = min(a, b);
            list[j].b = max(a, b);
            if (list[j].a % 2 == 0 && list[j].a != 0) list[j].a -= 1;
            if (list[j].b % 2 == 0 && list[j].a != 0) list[j].b -= 1;
        }
        sort(list, list + n, func);
        for (int j = 0; j < n; ++j) {
            for (int k = list[j].a; k <= list[j].b; ++k) {
                check[k]++;
            }
        }
        int max = 1;
        for (int j = 0; j < 401; ++j) {
            if (check[j] > max) max = check[j];
        }
        printf("%d\n", max * 10);
    }
    return 0;
}
