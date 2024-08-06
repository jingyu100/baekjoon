#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int change[6] = {500, 100, 50, 10, 5, 1};

int main() {
    int cent, cnt = 0;
    scanf("%d", &cent);
    int i = 0;
    cent = 1000-cent;
    while (1) {
        if (cent == 0) break;
        if (cent >= change[i]) {
            cent -= change[i];
            cnt++;
        } else
            i++;
    }
    printf("%d", cnt);
    return 0;
}
