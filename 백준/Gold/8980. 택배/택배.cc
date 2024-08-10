#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

struct temp {
    int a, b, c;
} list[10000];

int v[2001];

bool func(temp a, temp b) {
    if (a.b == b.b)
        return a.a < b.a;
    return a.b < b.b;
}

int main() {
    int n, c, m, ac;
    scanf("%d%d%d", &n, &c, &m);
    for (int i = 0; i < m; ++i) {
        scanf("%d%d%d", &list[i].a, &list[i].b, &list[i].c);
    }
    sort(list, list + m, func);
    int sum = 0;
    for (int i = 0; i < m; ++i) {
        int maxc = 0;
        for (int j = list[i].a; j < list[i].b; ++j) {
            if (maxc < v[j]) maxc = v[j];
        }
        if (list[i].c < c - maxc) ac = list[i].c;
        else ac = c - maxc;
        if (ac >= 0) {
            for (int j = list[i].a; j < list[i].b; ++j) {
                v[j] += ac;
            }
            sum += ac;
        }
    }
    printf("%d", sum);
    return 0;
}
