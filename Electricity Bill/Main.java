#include<stdio.h>
int main()
{
  float a;
  scanf("%f",&a);
  if(a<=200)
  {
    printf("Rs.%.0f",ceil(a*0.5));
  }
  else if(a>200 && a<=400)
  {
    printf("Rs.%.0f",ceil(a*0.65)+100.00);
  }
  else if(a>400 && a<=600)
  {
    printf("Rs.%.0f",ceil(a*0.8)+200.00);
  }
  else if(a>600)
  {
    printf("Rs.%.0f",ceil(a*1.25)+425.00);
  }
}