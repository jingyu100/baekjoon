#include <algorithm>
#include <stdio.h>
#include <stack>
#include <memory.h>
#include <queue>

using namespace std;

int n;
struct temp {
    int x, y;
} input[100001];

bool func(temp a, temp b) {
    if(a.x == b.x) return a.y < b.y;
    return a.x < b.x;
}

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d", &input[i].x, &input[i].y);
    }
    sort(input, input + n, func);
    for (int i = 0; i < n; ++i) {
        printf("%d %d\n", input[i].x, input[i].y);
    }
    return 0;
}
