#include<stdio.h>
int main()
{
  int n,v;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(int i=1; i<=n; i++)
  {
    v = pow(i,i);
    printf("%d ",v);
  }
}