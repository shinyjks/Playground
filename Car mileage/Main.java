#include<stdio.h>
int main()
{
  float m;
  int l,d;
  scanf("%f%d%d",&m,&l,&d);
  printf((m*l)>d?"Can reach":"Cannot reach");
}