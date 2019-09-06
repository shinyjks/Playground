#include<stdio.h>
int main()
{
  int n,r,o=0,i=1;
  scanf("%d",&n);
  while(n!=0)
  {
    r=n%8;
    o+=r*i;
    n/=8;
    i*=10;
  }
  printf("%d",o);
  return 0;
}