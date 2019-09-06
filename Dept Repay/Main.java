#include<stdio.h>
int main()
{
  float p,n,r,i,d;
  scanf("%f%f%f",&p,&n,&r);
  i = p * n * r / 100;
  d = i * 2 / 100;
  printf("%.2f\n%.2f\n%.2f\n%.2f",i,p+i,d,p+i-d);
}