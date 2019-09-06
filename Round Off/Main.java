#include<stdio.h>
int main()
{
  float a;
  int b;
  scanf("%f",&a);
  b = a;
  printf("%d\n%.1f\n%.1f",b,ceil(a),floor(a));
}