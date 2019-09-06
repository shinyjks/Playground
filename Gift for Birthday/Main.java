#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  printf((a%4==0)?(a%100==0)?(a%400==0)?"%d is a leap year":"%d is not a leap year":"%d is a leap year":"%d is not a leap year",a);
}