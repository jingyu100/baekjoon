#include <stdio.h>
#include <algorithm>
using namespace std;

int z[33], x[33], c[33];
int n, ans;

void func(int a) {
    if (a == n) {
        ans++;
        return;
    }
    for (int b = 0; b < n; b++) {
        if (!(z[b] + x[a + b] + c[a - b + n])) { 
            z[b] = x[a + b] = c[a-b+n] = 1;
            func(a + 1);
            z[b] = x[a + b] = c[a-b+n] = 0;
        }
    }
}

int main() {
    scanf("%d", &n);
    func(0);
    printf("%d", ans);
    return 0;
}
