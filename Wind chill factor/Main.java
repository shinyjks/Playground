#include<stdio.h>
#include<math.h>
int main()
{
  float t,v,a,p;
  scanf("%f%f",&t,&v);
  p = pow(v,0.16);
  a = 35.74 + (0.6215*t) + ((0.4275*t) - 35.75) * p;
  printf("%.2f",a);
}