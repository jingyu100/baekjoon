#include <stdio.h>
#include <algorithm>
#include <string>
#include <stack>
#include <memory.h>

using namespace std;

int a[3];

int main() {
    for (int i = 0; i < 3; ++i) {
        scanf("%d", &a[i]);
    }
    sort(a, a + 3);
    if (a[0] + a[1] > a[2]) printf("%d", a[0] + a[1] + a[2]);
    else printf("%d", (a[0] + a[1]) * 2 - 1);
}