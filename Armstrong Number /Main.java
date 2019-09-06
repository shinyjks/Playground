#include <stdio.h>
#include<math.h>
int main() {
	int n,a,b,d,count=0,sum=0,val=0;
  scanf("%d",&n);
  a=n;
  b=n;
  while(a>0)
  {
    a/=10;
    count++;
  }
  while(b>0)
  {
    d=b%10;
    val=pow(d,count);
    sum+=val;
    b/=10;
  }
    printf((sum==n)?"Armstrong Number":"Not an Armstrong Number");
	return 0;
}