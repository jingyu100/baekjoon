#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

int N, m, M, R, T, X, ans;

int main() {
    scanf("%d%d%d%d%d", &N, &m, &M, &T, &R);
    X = m;
    for (int i = 0; i < N;) {
        ans++;
        if (X + T <= M) {
            i++;
            X += T;
        } else {
            X -= R;
            if (X < m) X = m;
        }
        if (X + T > M && X == m) {
            printf("-1\n");
            exit(0);
        }
    }
    printf("%d\n", ans);
    return 0;
}
