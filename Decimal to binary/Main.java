#include<stdio.h>
int main()
{
  int n,r,i=1,b=0;
  scanf("%d",&n);
  while(n!=0)
  {
    r = n%2;
    b+=r*i;
    n/=2;
    i*=10;
  }
  printf("%d",b);
  return 0;
}