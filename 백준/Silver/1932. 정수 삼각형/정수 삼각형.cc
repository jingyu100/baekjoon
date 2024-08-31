#include <stdio.h>
#include <algorithm>
#include <string>
#include <stack>
#include <memory.h>

using namespace std;

int n, input[500][500];

void func(int x, int y) {
    if (y == n) {
        func(x - 1, 0);
        return;
    }
    if (x == 1) {
        input[0][0] = max(input[1][0] + input[0][0], input[1][1] + input[0][0]);
        printf("%d",input[0][0]);
        exit(0);
    }
    if (input[x - 1][y] + input[x][y] > input[x - 1][y] + input[x][y + 1]) {
        input[x - 1][y] = input[x - 1][y] + input[x][y];
    } else {
        input[x - 1][y] = input[x - 1][y] + input[x][y + 1];
    }
    func(x, y + 1);
}

int main() {
    scanf("%d", &n);
    if (n == 1) {
        int tmp;
        scanf("%d", &tmp);
        printf("%d", tmp);
        exit(0);
    }
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < i + 1; ++j) {
            scanf("%d", &input[i][j]);
        }
    }
    func(n - 1, 0);
    printf("%d", input[0][0]);
    return 0;
}