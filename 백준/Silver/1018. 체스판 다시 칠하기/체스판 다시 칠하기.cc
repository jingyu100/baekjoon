#include <stdio.h>
#include <algorithm>

using namespace std;

int n, m, ans = 64, bcnt, wcnt;
char input[51][51];

int main() {
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; ++i) {
        scanf("%s", input[i]);
    }
    ans = 64;
    for (int i = 0; i <= n - 8; ++i) {
        for (int j = 0; j <= m - 8; ++j) {
            bcnt = 0;
            wcnt = 0;
            for (int x = 0; x < 8; ++x) {
                for (int y = 0; y < 8; ++y) {
                    if ((x + y) % 2 == 0) {
                        if (input[i + x][j + y] != 'B') bcnt++;
                        if (input[i + x][j + y] != 'W') wcnt++;
                    } else {
                        if (input[i + x][j + y] != 'W') bcnt++;
                        if (input[i + x][j + y] != 'B') wcnt++;
                    }
                }
            }
            ans = min(ans, min(bcnt, wcnt));
        }
    }
    printf("%d", ans);
    return 0;
}
