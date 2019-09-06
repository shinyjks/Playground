#include<stdio.h>
int main()
{
  float p;
  int m;
  scanf("%f%d",&p,&m);
  switch(m)
  {
    case 1: printf("Chris father needs to pay Rs.%.2f.",p - p*20/100);
      		break;
    case 2: printf("Chris father needs to pay Rs.%.2f.",p);
      		break;
    case 3: 
    case 4:	printf("Chris father needs to pay Rs.%.2f.",p - p*10/100);
      		break;
    case 5: printf("Chris father needs to pay Rs.%.2f.",p);
      		break;
    case 6: 
    case 7: printf("Chris father needs to pay Rs.%.2f.",p - p*75/100);
      		break;
    case 8: 
    case 9: printf("Chris father needs to pay Rs.%.2f.",p);
      		break;
    case 10: 
    case 11: printf("Chris father needs to pay Rs.%.2f.",p - p*30/100);
      		 break;
    case 12: printf("Chris father needs to pay Rs.%.2f.",p - p*35/100);
      		break;
    default: printf("Invalid Month");
  }
  return 0;
}