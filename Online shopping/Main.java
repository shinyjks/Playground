#include<stdio.h>
int main()
{
  int fp,fd,fs,sp,sd,ss,ap,ad,as,ff,sf,af,ft,st,at;
  scanf("%d%d%d%d%d%d%d%d%d",&fp,&fd,&fs,&sp,&sd,&ss,&ap,&ad,&as);
  ft = fp * fd / 100;
  st = sp * sd / 100;
  at = ap * ad / 100;
  ff = fp - ft + fs;
  sf = sp - st + ss;
  af = ap - at + as;
  printf("In Flipkart: Rs.%d\nIn Snapdeal: Rs.%d\nIn Amazon: Rs.%d\n",ff,sf,af);
  printf((ff<sf && ff<af)?"He will prefer Flipkart":(sf<af)?"He will prefer Snapdeal":"He will prefer Amazon");
}