#include <stdio.h>
#define M 100
int x=-1,n,tot,max,f,p[5]={0,1,3,4,2},cnt,t,k;
int a[M],b[M],c[M],d[M],r[M];
int main()
{
    int i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d%d",&a[i],&b[i]);
        c[i]=a[i]; d[i]=b[i];
    }
    for(i=0;i<n;i++)                // 정렬하기
    {
        for(j=i+1;j<n;j++)
        {
            if(p[c[i]]>p[c[j]] ||
                (c[i]==c[j] && (c[i]==1 || c[i]==4) && d[i]>d[j]) ||
                (c[i]==c[j] && (c[i]==2 || c[i]==3) && d[i]<d[j])
                )
            {
                t=c[i]; c[i]=c[j]; c[j]=t;
                k=d[i]; d[i]=d[j]; d[j]=k;
            }
        }
    }
    for(i=0;i<n;i++)             // 정렬자료를 기반으로 순위구하기
    {
        for(j=0;j<n;j++)
        {
            if(a[i]==c[j] && b[i]==d[j]) r[i]=j;
        }
    }
    for(i=0;i<n;i+=2)            // 앞의 순위가 크면 교체해 앞의 순위가 항상 작게 만들기
    {
        if(r[i]>r[i+1])  { t=r[i]; r[i]=r[i+1]; r[i+1]=t; }
    }
    for(i=0;i<n;i+=2)             // 구한 순위 정보를 이용해 교차점개수를 구하기
    {
        tot=0;
        for(j=0;j<n;j+=2)
        {
            cnt=0;
            if(r[i]<r[j] && r[i+1]>r[j]) cnt++;
            if(r[i]<r[j+1] && r[i+1]>r[j+1]) cnt++;
            if(cnt==1) tot++;
        }
        if(max<tot) max=tot;
        f+=tot;
    }
    printf("%d\n%d",f/2,max);
    return 0;
}