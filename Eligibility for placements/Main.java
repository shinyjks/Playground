#include<stdio.h>
int main()
{
  char str[20]="";
  int r,a;
  float c;
  gets(str);
  scanf("%d",&r);
  scanf("%f",&c);
  scanf("%d",&a);
  if(a==0 && c>=7.0)
  {
    puts(str);
    printf("%d\nEligible to attend placement",r);
  }
  else if(a<=2 && c>=7.5)
  {
    puts(str);
    printf("%d\nEligible to attend placement",r);
  }
  else
  {
    puts(str);
    printf("%d\nNot Eligible to attend placement",r);
  }
}