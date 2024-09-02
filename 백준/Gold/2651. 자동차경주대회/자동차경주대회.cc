#include <algorithm>
#include <cstdio>

using namespace std;

int mx, n, arr[102];
int time[102];
int dist[102];
long long dp[102];
int before[102];

int main() {
    for (int i = 0; i < 102; i++) {
        dp[i] = 2147483648LL;
    }
    dp[0] = 0;
    scanf("%d %d", &mx, &n);
    if (n == 0) {
        printf("0\n0");
        return 0;
    }
    for (int i = 0; i <= n; i++) {
        scanf("%d", &arr[i]);
        dist[i + 1] = dist[i] + arr[i];
    }
    for (int i = 0; i < n; i++) {
        scanf("%d", &time[i]);
    }
    for (int i = 1; i <= n + 1; i++) {
        int idx = i - 1;
        while (idx >= 0 && dist[i] - dist[idx] <= mx) {
            if (dp[i] > dp[idx] + time[i - 1]) {
                dp[i] = dp[idx] + time[i - 1];
                before[i] = idx;
            }
            idx -= 1;
        }
    }
    printf("%lld\n", dp[n + 1]);
    int cnt = 0;
    int now = n + 1;
    int ans[102] = {0,};
    while (before[now]) {
        cnt++;
        ans[cnt] = before[now];
        now = before[now];
    }
    printf("%d\n", cnt);
    while (cnt) {
        printf("%d ", ans[cnt--]);
    }
    return 0;
}
