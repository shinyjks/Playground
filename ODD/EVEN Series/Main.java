#include<stdio.h>
int main()
{
	int n,val;
  scanf("%d",&n);
  n=n-1;
  if(n%2 == 0)
  {
    val=n/2;
    val*=2;
    printf("%d",val);
  }
  else
  {
    val=n/2;
    val*=1;
    printf("%d",val);
  }
	return 0;
}