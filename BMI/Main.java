#include<stdio.h>
int main()
{
  float w,h;
  scanf("%f%f",&w,&h);
  h/=100;
  printf(w/(h*h)<18?"You are underweight. Have an apple daily.":w/(h*h)>18 && w/(h*h)<25?"You are normal. Go walking daily and maintain it.":"You are obese. Go to doctor");
}