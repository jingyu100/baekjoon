#include <stdio.h>
#include <algorithm>

using namespace std;

int input[9], a, b, sum;

int main() {
    for (int i = 0; i < 9; ++i) {
        scanf("%d", &input[i]);
        sum += input[i];
    }
    sort(input, input + 9);
    for (int i = 0; i < 9; ++i) {
        for (int j = 0; j < 9; ++j) {
            if (i != j) {
                if (sum - input[i] - input[j] == 100) {
                    a = i;
                    b = j;
                }
            }
        }
    }
    for (int i = 0; i < 9; ++i) {
        if (i != a && i != b) printf("%d\n", input[i]);
    }
    return 0;
}
