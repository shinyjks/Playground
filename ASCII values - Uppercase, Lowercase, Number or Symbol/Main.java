#include<stdio.h>
int main()
{
  char ch;
  scanf("%c",&ch);
  int a = ch;
  printf((a>=65 && a<=91)?"Upper":(a>=97 && a<=123)?"Lower":(a>=48 && a<=57)?"Number":"Symbol");
}