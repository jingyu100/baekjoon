#include <algorithm>
#include <stdio.h>
#include <vector>

using namespace std;

int r1, r2, s;

int main() {
    scanf("%d%d", &r1, &s);
    r2 = s * 2 - r1;
    printf("%d", r2);
    return 0;
}