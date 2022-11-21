#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int no_of_bike=0,no_of_car=0,no_of_bus=0,no_of_scooty=0,no_of_riksha=0,no_of_otherVehicles=0,count=0,amount=0;
void scooty();
void bike();
void car();
void bus();
void riksha();
void other_transport_vehicle();
int menu();
void delete();
void showDetail();
int main()
{
    while(1)
    {
    
     switch(menu())
     {
        case 1:
        bus();
        break;
        case 2:
        bike();
        break;
        case 3:
        car();
        break;
        case 4:
        scooty();
        break;
        case 5:
        riksha();
        break;
        case 6:
        other_transport_vehicle();
        break;
        case 7:
        showDetail();
        break;
        case 8:
        delete();
        break;
        case 9:
        exit(0);
        default:
        printf("you have entered a wrong choice");
     }
     
  }
return 0;
}
void showDetail()
{
   printf("\n no of bus: %d",no_of_bus);
   printf("\n no of bike: %d",no_of_bike);
   printf("\n no of car: %d",no_of_car);
   printf("\n no of scooty: %d",no_of_scooty);
   printf("\n no of riksha: %d",no_of_riksha);
   printf("\n no of other transport vehicle: %d",no_of_otherVehicles);
   printf("\n Total no of vehicle: %d",count);
   printf("\n Total amount received: %d",amount);
}
void delete()
{
  no_of_bike=0;
  no_of_bus=0;
  no_of_car=0;
  no_of_otherVehicles=0;
  no_of_riksha=0;
  no_of_scooty=0;
  amount=0;
  count=0;
}
void scooty()
{
  printf("\n entry successful");
  no_of_scooty++;
  amount+=20;
  count++;

}
void bike()
{
  printf("\n entry successful");
  no_of_bike++;
  amount+=30;
  count++;
}
void bus()
{
  printf("\n entry successful");
  no_of_bus++;
  amount+=150;
  count++;

}
void riksha()
{
  printf("\n entry successful");
  no_of_riksha++;
  amount+=50;
  count++;
}
void car()
{
  printf("\n entry successful");
  no_of_car++;
  amount+=100;
  count++;

}
void other_transport_vehicle()
{
  printf("\n entry successful");
  no_of_otherVehicles++;
  amount+=200;
  count++;        
}
int menu()
{
  int ch;
  printf("\n 1. enter for bus");
  printf("\n 2. enter for bike");
  printf("\n 3. enter for car");
  printf("\n 4. enter for scooty");
  printf("\n 5. enter for riksha");
  printf("\n 6. enter for other transport vehicle");
  printf("\n 7. enter to shoe details\n");
  printf("\n 8. enter to delete data\n");
  printf("\n 9. enter to exit\n");
  printf("\n enter your choice:\n");
  scanf("%d",&ch);
  return(ch);
}