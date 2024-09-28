#include <algorithm>
#include <stdio.h>
#include <vector>

using namespace std;

int n, tmp, ysum, msum;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &tmp);
        int y = tmp / 30 * 10 + 10;
        int m = tmp / 60 * 15 + 15;
        ysum += y;
        msum += m;
    }
    if (ysum == msum) printf("Y M %d", ysum);
    else if (ysum > msum) printf("M %d", msum);
    else printf("Y %d", ysum);
    return 0;
}