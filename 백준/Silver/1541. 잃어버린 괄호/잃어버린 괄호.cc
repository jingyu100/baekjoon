#include <algorithm>
#include <stack>
#include <stdio.h>
#include <string.h>

using namespace std;

char input[51];

int main() {
    scanf("%s", input);
    int result = 0, tmp = 0;
    bool minusCheck = false;
    for (int i = 0; input[i] != 0; i++) {
        if (input[i] == '-' || input[i] == '+') {
            if (minusCheck) result -= tmp;
            else result += tmp;
            tmp = 0;
            if (input[i] == '-') minusCheck = true;
        } else {
            tmp *= 10;
            tmp += input[i] - '0';
        }
    }
    if (minusCheck) result -= tmp;
    else result += tmp;
    printf("%d", result);
    return 0;
}
