#include <algorithm>
#include <stdio.h>
#include <queue>
#include <vector>
#include <cstring>

using namespace std;

int n, m, a, b, c, chk[1001], list[1001];
long long int sum;
int input[1001][1001];

void func(int x) {
    memset(list, 10001, sizeof(list));
    list[x] = 0;
    for (int i = 0; i < n; ++i) {
        int min = 10001, minidx = -1;
        for (int j = 1; j <= n; ++j) {
            if (!chk[j] && list[j] < min) {
                min = list[j];
                minidx = j;
            }
        }
        if (minidx == -1) break;
        chk[minidx] = 1;
        sum += list[minidx];
        for (int j = 1; j <= n; ++j) {
            if (!chk[j] && input[minidx][j] && input[minidx][j] < list[j]) {
                list[j] = input[minidx][j];
            }
        }
    }
}

int main() {
    scanf("%d%d", &n, &m);
    memset(input, 0, sizeof(input));
    for (int i = 0; i < m; ++i) {
        scanf("%d%d%d", &a, &b, &c);
        input[a][b] = c;
        input[b][a] = c;
    }
    func(1);
    printf("%lld", sum);
    return 0;
}
