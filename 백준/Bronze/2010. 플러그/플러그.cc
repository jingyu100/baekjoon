#include  <stdio.h>

int n, s, tmp;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; i++) { 
        scanf("%d", &s);
        tmp += s;
    }
    printf("%d", tmp - (n - 1));
    return 0;
}