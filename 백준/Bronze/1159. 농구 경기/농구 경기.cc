#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

char name[40];
int list[27];
int n, flag;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%s", name);
        list[name[0] - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
        if (list[i] >= 5) {
            printf("%c", i + 'a');
            flag = 1;
        }
    }
    if (flag == 0) printf("PREDAJA");
    return 0;
}