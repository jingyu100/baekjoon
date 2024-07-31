#include <stdio.h>
#include <string.h>
#include <algorithm>
 
using namespace std;
 
int func(int a, int limit) {
    if (limit - a == 1) {
        return a * limit;
    }
    if (a == limit) {
        return 0;
    }
    return func(a, (a + limit) / 2) + func((a + limit) / 2 + 1, limit);
}
 
int main() {
    int n;
    scanf("%d", &n);
    printf("%d", func(1, n));
    return 0;
}