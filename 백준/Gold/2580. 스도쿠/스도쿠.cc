#include <algorithm>
#include <stdio.h>
#include <string.h>
using namespace std;

int input[10][10], check1;

void func(int x, int y) {
    if (x == 9) {
        check1 = 1;
        return;
    }
    if (y == 9) {
        func(x + 1, 0);
        return;
    }
    if (input[x][y] != 0) {
        func(x, y + 1);
        return;
    }
    int check[10] = {0};
    for (int i = 0; i < 9; ++i) {
        if (input[x][i]) check[input[x][i]] = 1;
    }
    for (int i = 0; i < 9; ++i) {
        if (input[i][y]) check[input[i][y]] = 1;
    }
    int tmpx = (x / 3) * 3, tmpy = (y / 3) * 3;
    for (int i = tmpx; i < tmpx + 3; ++i) {
        for (int j = tmpy; j < tmpy + 3; ++j) {
            if (input[i][j]) check[input[i][j]] = 1;
        }
    }
    for (int i = 1; i < 10; ++i) {
        if (check1) return;
        if (!check[i]) {
            input[x][y] = i;
            func(x, y + 1);
            if (!check1) input[x][y] = 0;
        }
    }
}

int main() {
    for (int i = 0; i < 9; ++i) {
        for (int j = 0; j < 9; ++j) {
            scanf("%d", &input[i][j]);
        }
    }
    func(0, 0);
    for (int i = 0; i < 9; ++i) {
        for (int j = 0; j < 9; ++j) {
            printf("%d ", input[i][j]);
        }
        if (i != 8) printf("\n");
    }
}
