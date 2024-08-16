#include <stdio.h>

int main() {
    long long n, m;
    scanf("%lld%lld",&n,&m);
    long long tmp = n - m;
    if(tmp < 0) tmp *= -1;
    printf("%lld",tmp);
    return 0;
}