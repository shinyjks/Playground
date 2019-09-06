#include<stdio.h>
int main()
{
  int wl,wb,l1,b1,l2,b2;
  scanf("%d%d%d%d%d%d",&wl,&wb,&l1,&b1,&l2,&b2);
  printf((wl*wb)>(l1*b1)+(l2*b2)?"Raj can fix both painting":"Raj cannot fix both painting");
}