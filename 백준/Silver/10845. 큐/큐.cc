#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

int list[10001], inputidx = -1, printidx = -1;
char input[10];

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%s", input);
        if (strcmp(input, "push") == 0) {
            int tmp;
            scanf("%d", &tmp);
            list[++inputidx] = tmp;
        } else if (strcmp(input, "pop") == 0) {
            if (printidx == inputidx) printf("-1\n");
            else
                printf("%d\n", list[++printidx]);
        } else if (strcmp(input, "size") == 0) {
            printf("%d\n", inputidx - printidx);
        } else if (strcmp(input, "empty") == 0) {
            if (printidx == inputidx) printf("1\n");
            else
                printf("0\n");
        } else if (strcmp(input, "front") == 0) {
            if (printidx == inputidx) printf("-1\n");
            else
                printf("%d\n", list[printidx + 1]);
        } else if (strcmp(input, "back") == 0) {
            if (printidx == inputidx) printf("-1\n");
            else
                printf("%d\n", list[inputidx]);
        }
    }
    return 0;
}
