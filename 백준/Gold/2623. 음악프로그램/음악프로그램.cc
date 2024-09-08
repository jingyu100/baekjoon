#include <algorithm>
#include <stdio.h>
#include <vector>
#include <cstring>
#include <queue>

using namespace std;

int n, m, tmp, hit[1001],chk[1001];
vector<int> vec[1001],ans;
queue<int> q;

void func() {
    while (!(q.empty())) {
        int d = q.front();
        chk[d] = 1;
        ans.push_back(d);
//        printf("%d\n",d);
        q.pop();
        for (int i = 0; i < vec[d].size(); ++i) {
            if (!chk[vec[d][i]] && (hit[vec[d][i]] - 1) == 0) {
                q.push(vec[d][i]);
                chk[vec[d][i]] = 1;
                hit[vec[d][i]]--;
            } else hit[vec[d][i]]--;
        }
    }
}

int main() {
    scanf("%d%d", &n, &m);
    for (int i = 0; i < m; ++i) {
        scanf("%d", &tmp);
        int tmpa = 0, tmpb = 0;
        scanf("%d", &tmpa);
        for (int j = 0; j < tmp - 1; ++j) {
            scanf("%d", &tmpb);
            vec[tmpa].push_back(tmpb);
            hit[tmpb]++;
            tmpa = tmpb;
        }
    }
    for (int j = 1; j <= n; ++j) {
        if (!hit[j]) q.push(j);
    }
    func();
    for (int i = 1; i <= n; ++i) {
        if(hit[i] > 0) {
            printf("0");
            exit(0);
        }
    }
    for (int i = 0; i < ans.size(); ++i) {
        printf("%d\n",ans[i]);
    }
    return 0;
}
