#include<stdio.h>
int main()
{
  int n,i=3,v=0;
  printf("Enter n value\n");
  scanf("%d",&n);
  printf("%d",v);
  while(n-1>0)
  {
    if(i%2 != 0)
    {
      v += i;
      printf(" %d",v);
      i += 2;
      n--;
    }
  }
}