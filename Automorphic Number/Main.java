#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  printf((a*a)%10 == a?"Automorphic Number":"Not Automorphic Number");
}