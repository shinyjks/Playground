#include<stdio.h>
int main()
{
  int a,b,c,d;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  printf((a%d == 0)?"Car 1 goes into road A":(b%d == 0)?"Car 1 goes into road B":(b%c ==0)?"Car 1 goes into road C":"No path exist");
}