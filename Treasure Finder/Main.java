#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if(a>b && a>c)
  {
    if(b>c)
    {
      printf("The treasure is in the box which has number %d.",b);
    }
    else
    {
      printf("The treasure is in the box which has number %d.",c);
    }
  }
  else if(b>a && b>c)
  {
    if(a>c)
    {
      printf("The treasure is in the box which has number %d.",a);
    }
    else
    {
      printf("The treasure is in the box which has number %d.",c);
    }
  }
  else if(c>a && c>b)
  {
    if(a>b)
    {
      printf("The treasure is in the box which has number %d.",a);
    }
    else
    {
      printf("The treasure is in the box which has number %d.",b);
    }
  }
  if(b%a == 0 && c%a == 0)
  {
    printf("\nThe code to open the box is %d.",a);
  }
  else if(a%b == 0 && c%b == 0)
  {
    printf("\nThe code to open the box is %d.",b);
  }
  else if(a%c == 0 && b%c == 0)
  {
    printf("\nThe code to open the box is %d.",c);
  }
}