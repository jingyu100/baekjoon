#include <algorithm>
#include <memory.h>
#include <stack>
#include <stdio.h>
#include <string.h>
using namespace std;

int q[5001];
int ans[5001];

int main() {
    int n, k, cnt = 0, anscnt = 0;
    scanf("%d%d", &n, &k);
    for (int i = 1; i <= n; ++i) {
        q[i] = i;
    }
    int num = k;
    printf("<");
    while (1) {
        ans[anscnt++] = q[num];
        if (anscnt == n) break;
        q[num] = 0;
        while (1) {
            if (cnt == k) {
                break;
            }
            num++;
            if (num > n) num = 1;
            if (q[num] > 0) {
                cnt++;
            }
        }
        if (cnt == 0) break;
        else
            cnt = 0;
    }
    for (int i = 0; i < n - 1; ++i) {
        printf("%d, ", ans[i]);
    }
    printf("%d>", ans[n - 1]);
    return 0;
}
