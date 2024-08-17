#include <algorithm>
#include <stdio.h>
using namespace std;

int q[1000010];
int node[1000010];
int chk[1000010];

int main() {
    int n, iidx = 0, oidx = 0;
    scanf("%d", &n);
    q[iidx] = n;
    chk[n] = 1;
    while (oidx <= iidx) {
        int current = q[oidx];
        int currentNode = node[oidx];
        oidx++;
        if (current == 1) break;
        if (current % 3 == 0 && chk[current / 3] == 0) {
            q[++iidx] = current / 3;
            chk[current / 3] = 1;
            node[iidx] = currentNode + 1;
        }
        if (current % 2 == 0 && chk[current / 2] == 0) {
            q[++iidx] = current / 2;
            chk[current / 2] = 1;
            node[iidx] = currentNode + 1;
        }
        if (chk[current - 1] == 0) {
            q[++iidx] = current - 1;
            chk[current - 1] = 1;
            node[iidx] = currentNode + 1;
        }
    }
    printf("%d", node[oidx - 1]);
    return 0;
}
