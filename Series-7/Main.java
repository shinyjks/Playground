#include<stdio.h>
int main()
{
  int n,v1=10,v2=5;
  printf("Enter n value\n");
  scanf("%d",&n);
  printf("%d %d",v1,v2);
  for(int i=2; i<n; i++)
  {
    if(i%2==0)
    {
      v1 += 50;
      printf(" %d",v1);
    }
    else
    {
      v2 += 10;
      printf(" %d",v2);
    }
  }
}