//#include <algorithm>
//#include <memory.h>
//#include <stack>
#include <stdio.h>
//#include <string.h>
//using namespace std;

int q[5001];

int main() {
    int n, k, cnt, num;
    scanf("%d%d", &n, &k);
    num = k;
    printf("<%d", num);
    for (int i = 0; i < n - 1; ++i) {
        q[num] = 1;
        cnt = 0;
        while (1) {
            if (cnt == k) {
                printf(", %d", num);
                break;
            }
            num++;
            if (num > n) num = 1;
            if (q[num] == 0) cnt++;
        }
    }
    printf(">");
    return 0;
}
