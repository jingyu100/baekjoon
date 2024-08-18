//#include <algorithm>
//#include <memory.h>
//#include <stack>
#include <stdio.h>
//#include <string.h>
//using namespace std;

int q[5001*5001];

int main() {
    int n, k;
    scanf("%d%d", &n, &k);
    for (int i = 1; i <= n; ++i) q[i] = i;
    int iidx = n, oidx = 0;
    printf("<");
    while (oidx + 1 != iidx) {
        if (++oidx % k == 0) printf("%d, ", q[oidx]);
        else q[++iidx] = q[oidx];
    }
    printf("%d>", q[++oidx]);
    return 0;
}
