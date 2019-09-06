#include<stdio.h>
int main()
{
  int n,a[100];
  printf("Enter n value\n");
  scanf("%d",&n);
  a[0] = 1;
  a[1] = 2;
  printf("%d %d",a[0],a[1]);
  for(int i=2; i < n; i++)
  {
    a[i] = a[i-1] + a[i-2];
    printf(" %d",a[i]);
  }
    
}