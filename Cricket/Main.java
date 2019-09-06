#include<stdio.h>
int main()
{
  float tb,tr,r,b;
  scanf("%f%f%f%f",&tb,&tr,&r,&b);
  printf("%.0f\n%.1f\n%.1f\n%.1f\n",tb/6,43.8/6,(r*6)/43.8,(tr*6)/tb);
  printf((r*6)/b > (tr*6)/tb ? "Eligible to Win" : "Not Eligible to Win");
}