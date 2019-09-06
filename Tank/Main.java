#include<stdio.h>
int main()
{
  float r,h,w,t;
  scanf("%f%f%f%f",&r,&h,&w,&t);
  printf((3.14*r*r*h)<(w*t)?"The tank can be filled within %.1f hours":"The tank cannot be filled within %.1f hours",t);
}