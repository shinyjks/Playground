#include<stdio.h>
int main()
{
  int s,w;
  scanf("%d%d",&s,&w);
  printf((s*s*s*1000)>w?"Can store":"Cannot store");
}