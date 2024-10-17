#include <stdio.h>

int list[5], sum, tmp, maxInt = -1, maxIdx = -1;

int main() {
    for (int i = 0; i < 5; ++i) {
        sum = 0;
        for (int j = 0; j < 4; ++j) {
            scanf("%d", &tmp);
            sum += tmp;
        }
        list[i] = sum;
    }
    for (int i = 0; i < 5; ++i) {
        if (list[i] > maxInt) {
            maxInt = list[i];
            maxIdx = i;
        }
    }
    printf("%d %d", maxIdx + 1, maxInt);
    return 0;
}

