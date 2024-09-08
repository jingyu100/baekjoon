#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>

using namespace std;

int n, m, a, b, mode, node[1000001];

int find(int x) {
    if (x == node[x]) return x;
    node[x] = find(node[x]);
    return node[x];
}

void unionfunc(int o, int p) {
    int x = find(o);
    int y = find(p);
    if (x != y) node[y] = x;
}

int main() {
    scanf("%d%d", &n, &m);
    for (int i = 0; i <= n; ++i) {
        node[i] = i;
    }
    for (int i = 0; i < m; ++i) {
        scanf("%d%d%d", &mode, &a, &b);
        if (mode) {
            if (find(a) == find(b)) printf("YES\n");
            else printf("NO\n");
        } else unionfunc(a, b);
    }
    return 0;
}
