#include <stdio.h>
#include <algorithm>
#include <string>
#include <stack>
#include <memory.h>

using namespace std;

char k[5][6];
int chk[10][10], dab[10][2], cnt, ch[7], p;

void dfs(int x) {
    int i;
    ch[x] = 1;
    p++;
    for (i = 0; i < 7; i++)
        if (ch[i] == 0 && (abs(dab[x][0] - dab[i][0]) + abs(dab[x][1] - dab[i][1])) == 1) dfs(i);
}

void back(int n, int d, int y) {
    int i;
    if (y >= 4) return;
    if (d == 7) {
        p = 0;
        for (i = 0; i < 7; i++) ch[i] = 0;
        dfs(0);
        if (p == 7) cnt++; 
        return;
    }
    if (n >= 25) return;

    chk[n / 5][n % 5] = 1;
    dab[d][0] = n / 5;
    dab[d][1] = n % 5; 
    if (k[n / 5][n % 5] == 'Y') back(n + 1, d + 1, y + 1);
    else back(n + 1, d + 1, y);
    chk[n / 5][n % 5] = 0;                               
    back(n + 1, d, y);
}

int main() {
    int i;
    for (i = 0; i < 5; i++)
        scanf("%s", k[i]);
    back(0, 0, 0);
    printf("%d", cnt);
    return 0;
}