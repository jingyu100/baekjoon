#include <algorithm>
#include <stdio.h>
#include <vector>

using namespace std;

int n, m, tmp;
vector<int> plusVec;
vector<int> minusVec;

int plusSearch(int a) {
    int le = 0;
    int ri = plusVec.size() - 1;
    while (le <= ri) {
        int mid = (le + ri) / 2;
        if (plusVec[mid] == a) return 1;
        if (plusVec[mid] > a) ri = mid - 1;
        else le = mid + 1;
    }
    return 0;
}

int minusSearch(int a) {
    int le = 0;
    int ri = minusVec.size() - 1;
    while (le <= ri) {
        int mid = (le + ri) / 2;
        if (minusVec[mid] == a) return 1;
        if (minusVec[mid] > a) ri = mid - 1;
        else le = mid + 1;
    }
    return 0;
}

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &tmp);
        if (tmp >= 0) plusVec.push_back(tmp);
        else minusVec.push_back(tmp);
    }
    std::sort(plusVec.begin(), plusVec.end());
    std::sort(minusVec.begin(), minusVec.end());
    scanf("%d", &m);
    for (int i = 0; i < m; ++i) {
        scanf("%d", &tmp);
        if (tmp >= 0) {
            if (plusSearch(tmp)) printf("1 ");
            else printf("0 ");
        } else {
            if (minusSearch(tmp)) printf("1 ");
            else printf("0 ");
        }
    }
    return 0;
}
