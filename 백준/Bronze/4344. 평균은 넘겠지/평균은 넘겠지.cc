#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>

using namespace std;

int n, m, list[1001], cnt;
double avg;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &m);
        for (int j = 0; j < m; ++j) {
            scanf("%d", &list[j]);
            avg += list[j];
        }
        avg /= m;
        for (int j = 0; j < m; ++j) {
            if (list[j] > avg) cnt++;
        }
        printf("%.3lf\%\n", ((double)cnt / m) * 100);
        cnt = 0;
        avg = 0;
    }
    return 0;
}

