#include<stdio.h>
int main()
{
  int r,c,n,t;
  scanf("%d%d%d",&r,&c,&n);
  t = r * c;
  printf((n>c && n<=2*c)||(n>(t-(2*c)) && n<=(t-c))?"It is a mango tree":"It is not a mango tree");
}