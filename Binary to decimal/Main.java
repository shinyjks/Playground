#include<stdio.h>
#include<math.h>
int main()
{
  long int n;
  int r,i=0,d=0;
  scanf("%ld",&n);
  while(n!=0)
  {
    r=n%10;
    d+=r*pow(2,i);
    n/=10;
    ++i;
  }
  printf("%d",d);
  return 0;
}