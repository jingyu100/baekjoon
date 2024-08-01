#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

char a[101], s[101];
int main() {
    int top = -1, i;
    scanf("%s", &a);
    for (i = 0; a[i] != 0; i++) {
        if (a[i] >= 'A' && a[i] <= 'Z')
            printf("%c", a[i]);
        else if (top == -1 || a[i] == '(')
            s[++top] = a[i];
        else if (a[i] == ')') {
            while (1) {
                if (s[top] == '(') break;
                printf("%c", s[top--]);
            }
            top--;
        } else if (a[i] == '*' || a[i] == '/') {
            while (1) {
                if (top == -1 || s[top] == '(' || s[top] == '+' || s[top] == '-') break;
                printf("%c", s[top--]);
            }
            s[++top] = a[i];
        } else if (a[i] == '+' || a[i] == '-') {
            while (1) {
                if (top == -1 || s[top] == '(') break;
                printf("%c", s[top--]);
            }
            s[++top] = a[i];
        }
    }
    while (1) {
        if (top == -1) break;
        printf("%c", s[top--]);
    }

    return 0;
}