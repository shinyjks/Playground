#include<stdio.h>
int main()
{
  int num1,num2;
  scanf("%d%d",&num1,&num2);
  printf((num1==num2)?"Both number Equal":(num1>num2)?"num1 is the greatest":"num2 is the greatest");
  return 0;
}