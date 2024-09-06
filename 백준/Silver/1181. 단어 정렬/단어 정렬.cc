#include <algorithm>
#include <stdio.h>
#include <stack>
#include <memory.h>
#include <queue>
#include <string.h>

using namespace std;

int cmp(const void *a, const void *b) {
    char *strA = *(char **) a;
    char *strB = *(char **) b;
    if (strlen(strA) == strlen(strB)) {
        return strcmp(strA, strB);
    } else {
        return strlen(strA) - strlen(strB);
    }
}

char *word[20000];

int main() {
    int N;
    scanf("%d", &N);
    for (int i = 0; i < N; i++) {
        word[i] = (char *) malloc(51 * sizeof(char)); 
        scanf("%s", word[i]);
    }
    qsort(word, N, sizeof(char *), cmp);
    printf("%s\n", word[0]);
    for (int i = 1; i < N; i++) {
        if (strcmp(word[i], word[i - 1]) != 0) {
            printf("%s\n", word[i]);
        }
    }
    return 0;
}
