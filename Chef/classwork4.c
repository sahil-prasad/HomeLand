#include<stdio.h>
#include<conio.h>
void main()
{
    int p,r,t;      /*declaration statement*/
    float si;       /*p-principle,t-time,si-simple interest*/
    clrscr();
    p=4000;
    r=6.5;
    t=2;
    si=(p*r*t)/100;
    printf("%f",si);
    getch();
}