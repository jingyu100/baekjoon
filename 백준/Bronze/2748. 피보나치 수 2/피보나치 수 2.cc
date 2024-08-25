#include <algorithm>
#include <memory.h>
#include <stdio.h>
#include <string.h>
using namespace std;

int n;
long long int check[91];

void func(int a) {
    if (check[a]) return;
    if (a <= 2) {
        check[a] = 1;
        return;
    }
    func(a - 2);
    func(a - 1);
    check[a] = check[a - 1] + check[a - 2];
}

int main() {
    scanf("%d", &n);
    if(n==0) {
        printf("0");
        exit(0);
    }
    func(n);
    printf("%lld", check[n]);
    return 0;
}
