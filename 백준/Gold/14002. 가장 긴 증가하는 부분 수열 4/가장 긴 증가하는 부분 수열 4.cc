#include <algorithm>
#include <memory.h>
#include <stdio.h>
using namespace std;

int n, input[1001], depth[1001] = {1}, rev[1001] = {-1}, max_depth, max_idx;
int printl[1001];

void func(int a) {
    int cnt = 0, max = 0, maxidx = -1;
    if (a >= n) return;
    for (int i = 0; i < a; ++i) {
        if (input[a] > input[i]) {
            if (depth[i] > max) {
                max = depth[i];
                maxidx = i;
            }
        }
    }
    if (maxidx != -1) {
        depth[a] = max + 1;
        rev[a] = maxidx;
    }
    func(a + 1);
}

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &input[i]);
    }
    fill(depth, depth + 1001, 1);
    fill(rev, rev + 1001, -1);
    func(1);
    for (int i = 0; i < n; ++i) {
        if (depth[i] > max_depth) {
            max_depth = depth[i];
            max_idx = i;
        }
    }
    printf("%d\n", max_depth);
    int idx = max_idx;
    int cnt = 0;
    while (idx != -1) {
        printl[cnt++] = input[idx];
        idx = rev[idx];
    }
    for (int i = cnt - 1; i >= 0; --i) {
        printf("%d ",printl[i]);
    }
    return 0;
}
