#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>

using namespace std;

int n;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        char tmp[1001];
        scanf("%s", tmp);
        if (strlen(tmp) >= 6 && strlen(tmp) <= 9) {
            printf("yes\n");
        } else {
            printf("no\n");
        }
    }
}

