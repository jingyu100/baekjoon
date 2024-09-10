#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>

using namespace std;

int list[3];

int main() {
    for (int i = 0; i < 3; ++i) {
        scanf("%d", &list[i]);
    }
    sort(list, list + 3);
    printf("%d", list[1]);
    return 0;
}

