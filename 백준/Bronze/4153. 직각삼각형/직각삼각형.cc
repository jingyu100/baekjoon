#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

int input[3];

int main() {
    while (1) {
        for (int i = 0; i < 3; ++i) {
            scanf("%d", &input[i]);
        }
        if (input[0] == 0 && input[1] == 0 && input[2] == 0) break;
        sort(input, input + 3);
        if(input[0]*input[0] + input[1]*input[1] == input[2]*input[2]) printf("right\n");
        else printf("wrong\n");
    }
    return 0;
}