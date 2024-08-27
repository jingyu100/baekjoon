#include <algorithm>
#include <stdio.h>
using namespace std;

int n, minx = 10001, miny = 10001, maxx = -10001, maxy = -10001;
struct temp {
  int x, y;
} input[100001];

int main() {
  scanf("%d", &n);
  for (int i = 1; i <= n; i++) {
    scanf("%d%d", &input[i].x, &input[i].y);
    maxx = max(maxx, input[i].x);
    maxy = max(maxy, input[i].y);
    minx = min(minx, input[i].x);
    miny = min(miny, input[i].y);
  }
  printf("%d", (maxx - minx) * (maxy - miny));
  return 0;
}