#include <algorithm>
#include <stdio.h>
#include <vector>

using namespace std;

int list[15][15];
int t, k, n;

int main() {
    for (int i = 0; i < 15; i++) {
        list[0][i] = i;
    }
    for (int i = 1; i < 15; i++) {
        for (int j = 1; j < 15; j++) {
            list[i][j] = list[i - 1][j] + list[i][j - 1];
        }
    }
    scanf("%d", &t);
    for (int i = 0; i < t; i++) {
        scanf("%d %d", &k, &n);
        printf("%d\n", list[k][n]);
    }
    return 0;
}