#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int main() {
    int cent, cnt = 0;
    scanf("%d", &cent);
    if(cent < 5 && cent%2 == 1) {
        printf("-1");
        return 0;
    }
    while (1) {
        if (cent == 0) break;
        if ((cent - 5) % 2 == 0 || (cent - 5) % 5 == 0) {
            cent -= 5;
            cnt++;
        } else {
            cent -= 2;
            cnt++;
        }
    }
    printf("%d", cnt);
    return 0;
}
