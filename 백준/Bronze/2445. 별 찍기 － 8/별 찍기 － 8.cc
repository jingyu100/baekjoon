#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

int n, mid, tmp;

int main() {
    scanf("%d", &n);
    int end = 2 * n;
    mid = (2 * n - 1) / 2 + 1;
    for (int i = 1; i <= 2 * n - 1; ++i) {
        for (int j = 1; j <= 2 * n; ++j) {
            if (j <= 1 + tmp || j >= end - tmp) printf("*");
            else printf(" ");
        }
        if(i >= mid) tmp--;
        else tmp++;
        printf("\n");
    }
    return 0;
}