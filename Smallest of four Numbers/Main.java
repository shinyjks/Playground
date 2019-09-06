#include<stdio.h>

int main()
{
  int n1,n2,n3,n4,n5,n6;
  scanf("%d%d%d%d",&n1,&n2,&n3,&n4);
  n5=(n1<n2)?n1:n2;
  n6=(n3<n4)?n3:n4;
  printf("%d",n5<n6?n5:n6);
    return 0;
}