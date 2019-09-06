#include<stdio.h>
int main()
{
  int a,b,c,x,y,z;
  scanf("%d%d%d",&a,&b,&c);
  x = a*b/100;
  y = (a-x)*c/100;
  z = (a-x-y)/3;
  printf("%d\n%d\n%d",x,y,z);
}