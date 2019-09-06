#include<stdio.h>
int main()
{
  char ch[100];
  int a,p,d;
  scanf("%s%d%d%d",ch,&a,&p,&d);
  if(d<a)
  {
    printf("The amount of %d %s is %d",d,ch,d*p);
  }
  else if(d>a && a!=0)
  {
    printf("Only %d %s are available",a,ch);
  }
  else if(a==0)
  {
    printf("Out of stock");
  }
}