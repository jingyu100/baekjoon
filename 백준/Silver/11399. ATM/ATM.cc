#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int list[1005];

bool func(int a, int b) {
    return a < b;
}

int main() {
    int n, ans = 0;
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
        scanf("%d", &list[i]);
    sort(list, list + n, func);
    for (int i = 0; i < n; i++)
        ans += list[i] * (n - i);
    printf("%d", ans);
    return 0;
}