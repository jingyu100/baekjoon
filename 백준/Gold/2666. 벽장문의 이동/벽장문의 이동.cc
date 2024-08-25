#include <algorithm>
#include <stdio.h>
using namespace std;

int n, length, a, b, input[21], min1 = 1000000;

void func(int z, int x, int c, int idx) {
    if (idx == length) {
        if (c < min1) min1 = c;
        return;
    }
    if (input[idx] <= z)
        func(input[idx], x, c + abs(z - input[idx]), idx + 1);
    else if (input[idx] >= x)
        func(z, input[idx], c + abs(x - input[idx]), idx + 1);
    else {
        func(input[idx], x, c + abs(z - input[idx]), idx + 1);
        func(z, input[idx], c + abs(x - input[idx]), idx + 1);
    }
}

int main() {
    scanf("%d", &n);
    scanf("%d%d", &a, &b);
    scanf("%d", &length);
    for (int i = 0; i < length; ++i) {
        scanf("%d", &input[i]);
    }
    func(a, b, 0, 0);
    printf("%d", min1);
    return 0;
}
