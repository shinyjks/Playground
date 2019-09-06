#include<stdio.h>
int main()
{
  int n,v=7,count=0;
  scanf("%d",&n);
  while(count < n)
  {
    printf("%d ",v);
    count++;
    v=v-2;
    if(count < n)
    {
    	printf("%d ",v);
    	count++;
    	v=v+3;
    }
  }
    
}