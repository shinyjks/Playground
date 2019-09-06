#include<stdio.h>
int main()
{
  float x1,y1,x2,y2,x3,y3;
  scanf("%f%f%f%f%f%f",&x1,&y1,&x2,&y2,&x3,&y3);
  printf("%.1f\n%.1f",(x1+x2+x3)/3,(y1+y2+y3)/3);
}