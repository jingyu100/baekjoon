#include <algorithm>
#include <stdio.h>
#include <string>

using namespace std;

char line[100];
int N;
double num[50], calc[50];

int main() {
    int cnt = 0;
    scanf("%d", &N);
    scanf("%s", line);
    for (int i = 0; i < N; ++i) {
        scanf("%lf", &num[i]);
    }
    for (int i = 0; line[i] != 0; ++i) {
        if (line[i] >= 'A' && line[i] <= 'Z') {
            calc[cnt] = num[line[i] - 65];
            cnt++;
        }
        if (line[i] == '+') {
            cnt--;
            calc[cnt - 1] += calc[cnt];
        }
        if (line[i] == '-') {
            cnt--;
            calc[cnt - 1] -= calc[cnt];
        }
        if (line[i] == '*') {
            cnt--;
            calc[cnt - 1] *= calc[cnt];
        }
        if (line[i] == '/') {
            cnt--;
            calc[cnt - 1] /= calc[cnt];
        }
    }
    printf("%0.2lf", calc[0]);
    return 0;
}