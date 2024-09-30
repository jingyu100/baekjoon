#include <algorithm>
#include <stdio.h>
#include <vector>

using namespace std;

int tmp, asc=100, des=100;

int main() {
    scanf("%d", &tmp);
    if (tmp == 1) {
        asc = 2;
        for (int i = 0; i < 7; ++i) {
            scanf("%d", &tmp);
            if (tmp == asc) asc++;
            else {
                printf("mixed");
                exit(0);
            }
        }
    } else if (tmp == 8) {
        des = 7;
        for (int i = 0; i < 7; ++i) {
            scanf("%d", &tmp);
            if (tmp == des) des--;
            else {
                printf("mixed");
                exit(0);
            }
        }
    } else {
        printf("mixed");
        exit(0);
    }
    if (asc == 9) printf("ascending");
    if (des == 0) printf("descending");
    return 0;
}