#include<stdio.h>
int main()
{
  int year;
  scanf("%d",&year);
  printf(((year%4==0)?((year%100==0)?((year%400==0)?"Leap year":"Not Leap year"):"Leap year"):"Not Leap year"));
  return 0;
}