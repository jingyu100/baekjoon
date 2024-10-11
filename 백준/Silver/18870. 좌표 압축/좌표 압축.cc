#include <stdio.h>
#include <algorithm>
#include <vector>

using namespace std;

int n, input[1000001], ans[1000001];
vector<int> sortList;

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &input[i]);
        sortList.push_back(input[i]);
    }
    sort(sortList.begin(), sortList.end());
    sortList.erase(unique(sortList.begin(), sortList.end()), sortList.end());
    for (int i = 0; i < n; ++i) {
        ans[i] = lower_bound(sortList.begin(), sortList.end(), input[i]) - sortList.begin();
    }
    for (int i = 0; i < n; ++i) {
        printf("%d ", ans[i]);
    }

    return 0;
}
