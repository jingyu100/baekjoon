#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int list[26][26];
int housecount[625];
int listx[4] = {1, -1, 0, 0};
int listy[4] = {0, 0, 1, -1};
int dangee, cnt = -1;

void func(int x, int y) {
    housecount[cnt]++;
    list[x][y] = 0;
    for (int i = 0; i < 4; ++i) {
        int x1 = x + listx[i];
        int y1 = y + listy[i];
        if (list[x1][y1] == 1) func(x1, y1);
    }
}

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            scanf("%1d", &list[i][j]);
        }
    }
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            if (list[i][j] == 1) {
                cnt++;
                dangee++;
                func(i, j);
            }
        }
    }
    for (int i = 0; i < dangee; ++i) {
        for (int j = i + 1; j < dangee; ++j) {
            if (housecount[i] > housecount[j]) {
                int tmp = housecount[i];
                housecount[i] = housecount[j];
                housecount[j] = tmp;
            }
        }
    }
    printf("%d\n", dangee);
    for (int i = 0; i < dangee; ++i) {
        if (i == dangee - 1) printf("%d", housecount[i]);
        else
            printf("%d\n", housecount[i]);
    }
    return 0;
}