#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

struct temp {
    int start, end;
} list[100001];

bool func(temp a, temp b) {
    if (a.start == b.start) return a.end < b.end;
    return a.start < b.start;
}

int main() {
    int n, a, b, c, d;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d%d%d", &a, &b, &c, &d);
        list[i].start = a * 100 + b;
        list[i].end = c * 100 + d;
    }

    sort(list, list + n, func);
    int end = 301, cnt = 0, i = 0, maxEnd = 0;
    bool found = false;
    while (end <= 1130) {
        found = false;
        for (; i < n; ++i) {
            if (list[i].start > end) break;
            if (list[i].start <= end && list[i].end > maxEnd) {
                maxEnd = list[i].end;
                found = true;
            }
        }
        if (!found) {
            printf("0");
            return 0;
        }
        end = maxEnd;
        cnt++;
        if (end > 1130) break;
    }
    printf("%d", cnt);
    return 0;
}
