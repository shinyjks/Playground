#include<stdio.h>
int main()
{
  float a,b,d,f;
  scanf("%f%f%f",&a,&b,&d);
  f = (a+b)*d/100;
  printf("%.2f\n%.2f\n%.2f",a+b,a+b-f,f);
}