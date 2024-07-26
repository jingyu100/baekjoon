#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string>

using namespace std;

int list[10000];
char order[5];

int main() {
    int n, cnt = -1;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        int num;
        scanf("%s", &order);
        if (order[0] == 'p') {
            if (order[1] == 'u') {
                scanf("%d", &num);
                list[++cnt] = num;
            }
            if (order[1] == 'o') {
                if(list[cnt] == 0) {
                    printf("-1\n");
                } else {
                    printf("%d\n", list[cnt]);
                    list[cnt--] = 0;
                }
            }
        }
        if (order[0] == 's') {
            printf("%d\n",cnt+1);
        }
        if (order[0] == 'e') {
            if(list[0] == 0) {
                printf("1\n");
            } else {
                printf("0\n");
            }
        }
        if (order[0] == 't') {
            if(list[cnt] == 0) {
                printf("-1\n");
            } else {
                printf("%d\n",list[cnt]);
            }
        }
    }
    return 0;
}