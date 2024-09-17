#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>
#include <string>
#include <stack>

using namespace std;

int n, arr[51];

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    sort(arr, arr + n);
    if (n == 1) printf("%d", arr[0] * arr[0]);
    else printf("%d", arr[0] * arr[n - 1]);
    return 0;
}