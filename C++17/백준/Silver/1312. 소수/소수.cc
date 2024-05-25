#include <stdio.h>
int main() {
    int x,y,cnt,ans;
    scanf("%d%d%d",&x,&y,&cnt);
    for (int i = 0; i < cnt; ++i) {
        x%=y;
        x*=10;
        ans=x/y;
    }
    printf("%d",ans);
}