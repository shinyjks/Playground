#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  printf(a>((b*75)+(c*30))?"Boat is stable":"Boat will drow");
}