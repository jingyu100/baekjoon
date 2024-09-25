#include <algorithm>
#include <stdio.h>
#include <vector>

using namespace std;

int a, b, x;

int main() {
    scanf("%d %d", &a, &b);
    for (int i = 1; i <= a && i <= b; i++) {
        if (a % i == 0 && b % i == 0)
            x = i;
    }
    printf("%d\n", x);
    printf("%d", a * b / x);
    return 0;
}
