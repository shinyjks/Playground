#include<stdio.h>
int main()
{
  int s,a,b,c,d;
  scanf("%d%d%d%d%d",&s,&a,&b,&c,&d);
  printf((s>a+b+c+d)?"He can save the money":(s==a+b+c+d)?"He can manage the expenses":"He has to work hard");
}