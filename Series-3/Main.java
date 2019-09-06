#include<stdio.h>
int main()
{
  int n,i=3,count=0,v=6;
  printf("Enter n value\n");
  scanf("%d",&n);
  printf("%d ",v);
  while(count < n-1)
  {
    if(i%2 != 0)
    {
      v = v + i;
      printf("%d ",v);
      i = i + 2;
      count++;
    }
  }
}