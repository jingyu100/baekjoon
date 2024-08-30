#include <stdio.h>
#include <algorithm>
//#include <string>
//#include <stack>
//#include <memory.h>
using namespace std;

int t, a, b;

int main() {
    scanf("%d", &t);
    for (int i = 0; i < t; ++i) {
        scanf("%d %d", &a, &b);
        int x = max(a, b);
        int y = min(a, b);
        while(1) {
            if(y == 0) break;
            int tmp = x;
            x = y;
            y = tmp%y;
        }
        printf("%d\n",a*b/x);
    }
}