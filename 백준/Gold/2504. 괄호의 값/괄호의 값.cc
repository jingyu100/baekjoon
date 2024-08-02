#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

char a[150], st1[150];
int n, st[150], sum, sw, key = -1;

int main() {
    int i, j;
    scanf("%s", a);
    n = strlen(a);
    for (i = 0; i < n; i++) {
        if (a[i] == '(' || a[i] == '[') st1[++key] = a[i];
        else if (a[i] == ')' && st1[key] == '(' && key > -1)
            key--;
        else if (a[i] == ']' && st1[key] == '[' && key > -1)
            key--;
        else {
            sw = 1;
            break;
        }
    }
    if (sw == 1 || key != -1) {
        printf("0");
        return 0;
    }

    key = -1;
    for (i = 0; i < n; i++) {
        sum = 0;
        if (a[i] == '(') st[++key] = -1;
        else if (a[i] == '[')
            st[++key] = -2;
        else if (a[i] == ')') {
            while (st[key] != -1) {
                sum += st[key--];
            }
            if (sum == 0) st[key] = 2;
            else
                st[key] = sum * 2;
        } else if (a[i] == ']') {
            while (st[key] != -2) {
                sum += st[key--];
            }
            if (sum == 0) st[key] = 3;
            else
                st[key] = sum * 3;
        }
    }

    sum = 0;
    for (i = 0; i <= key; i++) {
        sum += st[i];
    }
    printf("%d\n", sum);
    return 0;
}