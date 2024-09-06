#include <algorithm>
#include <stdio.h>
#include <stack>
#include <memory.h>
#include <queue>
#include <string>

using namespace std;

int n;
struct temp {
    int age, idx;
    char name[101];
} input[100001];

bool func(temp a, temp b) {
    if (a.age == b.age) return a.idx < b.idx;
    return a.age < b.age;
}

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d %s", &input[i].age, input[i].name);
        input[i].idx = i;
    }
    sort(input, input + n, func);
    for (int i = 0; i < n; ++i) {
        printf("%d %s\n", input[i].age, input[i].name);
    }
    return 0;
}
