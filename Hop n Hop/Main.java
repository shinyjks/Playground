#include<stdio.h>
#include<math.h>
int main()
{
  int x,y,a;
  scanf("%d%d",&x,&y);
  a = sqrt(((x-3)*(x-3))+((y-4)*(y-4)));
  printf("%d",a);
}