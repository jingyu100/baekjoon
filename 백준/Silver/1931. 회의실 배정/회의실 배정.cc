#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

struct temp {
    int min, max;
} list[100001];

bool func(temp a, temp b) {
    if(a.max == b.max) return a.min < b.min;
    return a.max < b.max;
}

int main() {
    int n, cnt = 1;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d", &list[i].min, &list[i].max);
    }
    sort(list, list + n, func);
//    for (int i = 0; i < n; ++i) {
//        printf("%d / %d\n",list[i].min , list[i].max);
//    }
    int max = list[0].max;
    for (int i = 1; i < n; ++i) {
        if (max <= list[i].min) {
            cnt++;
            max = list[i].max;
        }
    }
    printf("%d", cnt);
    return 0;
}
