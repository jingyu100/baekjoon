#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 6031)

#include <algorithm>
#include <stdio.h>
#include <stack>
#include <memory.h>
#include <queue>
#include <string>
#include <vector>

using namespace std;

int n, m, a, b, check[1001], cnt, ans,chk;
vector<int> vec[1001];
queue<int> q;

void bfs(int a) {
    q.push(a);
    while (!(q.empty())) {
        int d = q.front();
        q.pop();
        for (int i = 0; i < vec[d].size(); ++i) {
            if (!(check[vec[d][i]])) {
                q.push(vec[d][i]);
                check[vec[d][i]] = 1;
                cnt++;
            }
        }
    }
}

int main() {
    scanf("%d%d", &n, &m);
    if(n==0) {
        printf("0");
        exit(0);
    }
    for (int i = 0; i < m; ++i) {
        scanf("%d%d", &a, &b);
        vec[a].push_back(b);
        vec[b].push_back(a);
    }
    int f = n;
    for (int i = 1; i <= n; ++i) {
        if (!(check[i])) {
            bfs(i);
            if (cnt <= f) {
                ans++;
                f -= cnt;
            }
            cnt = 0;
        }
    }
    printf("%d", ans);
    return 0;
}
