#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

void func(long long n) {
    if (n == 0) {
        return;
    }
    func(n / 2);
    printf("%lld", n % 2);
}

int main() {
    long long num;
    scanf("%lld", &num);
    func(num);
    return 0;
}