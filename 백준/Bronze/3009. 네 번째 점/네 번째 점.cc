#include <algorithm>
#include <stdio.h>
using namespace std;

int main() {
    int x1, y1, x2, y2, x3, y3;
    scanf("%d %d %d %d %d %d", &x1, &y1, &x2, &y2, &x3, &y3);
    int rx = x1;
    int ry = y1;
    if (rx == x2) rx = x3;
    else if (rx == x3)
        rx = x2;
    if (ry == y2) ry = y3;
    else if (ry == y3)
        ry = y2;
    printf("%d %d\n", rx, ry);
    return 0;
}
