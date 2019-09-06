#include<stdio.h>

int main ()
{
  float r,a;
  scanf("%f%f",&r,&a);
  printf("%.2f",a/360*2*3.14*r);
  return 0;
}