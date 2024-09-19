#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

int n, mid;

int main() {
    scanf("%d", &n);
    int tmp = n - 1;
    mid = (2 * n - 1) / 2 + 1;
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= 2 * n - 1; ++j) {
            if (j > mid + tmp) break;
            if (j >= mid - tmp && j <= mid + tmp) printf("*");
            else printf(" ");
        }
        tmp--;
        printf("\n");
    }
    return 0;
}