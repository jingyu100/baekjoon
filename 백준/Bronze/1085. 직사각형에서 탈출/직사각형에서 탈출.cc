#include <algorithm>
#include <stdio.h>
using namespace std;

int main() {
    int x, y, w, h;
    scanf("%d%d%d%d", &x, &y, &w, &h);
    int tmp = min(x, y);
    int tmp1 = min(w - x, h - y);
    printf("%d", min(tmp, tmp1));
}