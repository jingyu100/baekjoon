#include <algorithm>
#include <stdio.h>
#include <stack>
#include <memory.h>
#include <queue>
#include <string.h>

using namespace std;

int n, m, input[101][101], a, b, check[101], cnt;
queue<int> q;

void func() {
    while(!(q.empty())) {
        int d = q.front();
        q.pop();
        for (int i = 1; i <= n; ++i) {
            if (input[d][i] && !(check[i])) {
                cnt++;
                q.push(i);
                check[i] = 1;
            }
        }
    }
}

int main() {
    scanf("%d%d", &n, &m);
    for (int i = 0; i < m; ++i) {
        scanf("%d %d", &a, &b);
        input[a][b] = 1, input[b][a] = 1;
    }
    q.push(1);
    check[1] = 1;
    func();
    printf("%d", cnt);
    return 0;
}
