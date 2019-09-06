#include<stdio.h>
int main()
{
  int n,v=2,s=2;
  scanf("%d",&n);
  printf("%d",v);
  while(n-1 > 0)
  {
    v += 1;
    v *= 2;
    v -= s;
    printf(" %d",v);
    s++;
    n--;
  }
}