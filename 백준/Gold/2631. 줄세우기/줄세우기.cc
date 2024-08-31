#include <stdio.h>
#include <algorithm>
#include <string>
#include <stack>
#include <memory.h>

using namespace std;

int n, input[201], check[201],cnt;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &input[i]);
    }
    check[0] = input[0];
    for (int i = 1; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            if(!check[j]) {
                check[j] = input[i];
                break;
            }
            if (input[i] < check[j]) {
                check[j] = input[i];
                break;
            }
        }
    }
    for (int i = 0; i < n; ++i) {
        if(check[i]) cnt++;
    }
    printf("%d",n-cnt);
    return 0;
}
