#include <algorithm>
#include <stdio.h>
#include <string>
using namespace std;

int input[3], sum;
string ans;

string check() {
  if (input[0] == 60 && input[1] == 60 && input[2] == 60) {
    return "Equilateral";
  } else if (input[0] == input[1] || input[1] == input[2] || input[0] == input[2]) {
    return "Isosceles";
  }
  return "Scalene";
}

int main() {
  for (int i = 0; i < 3; i++) {
    scanf("%d", &input[i]);
    sum += input[i];
  }
  if (sum == 180) ans = check();
  else {
    printf("Error");
    exit(0);
  }
  printf("%s", ans.c_str());
  return 0;
}