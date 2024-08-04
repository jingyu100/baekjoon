#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int colList[100], rowList[100];

int func(int a, int b) {
    return a < b;
}

int maxnum = 0;

int main() {
    int row, col;
    scanf("%d%d", &col, &row);
    int cnt;
    scanf("%d", &cnt);
    int chk, num;
    int rowcnt = 1, colcnt = 1;
    for (int i = 0; i < cnt; ++i) {
        scanf("%d%d", &chk, &num);
        if (chk == 0) {
            rowList[rowcnt++] = num;
        } else {
            colList[colcnt++] = num;
        }
    }
    rowList[rowcnt] = row;
    colList[colcnt] = col;
    sort(rowList, rowList + rowcnt, func);
    sort(colList, colList + colcnt, func);
    for (int i = 0; i < colcnt; ++i) {
        int colsum = colList[i + 1] - colList[i];
        for (int j = 0; j < rowcnt; ++j) {
            int rowsum = rowList[j + 1] - rowList[j];
            if (colsum * rowsum > maxnum) {
                maxnum = colsum * rowsum;
            }
        }
    }
    printf("%d", maxnum);
    return 0;
}