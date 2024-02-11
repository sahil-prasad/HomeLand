#include<stdio.h>
void main()
{
    int principle,time;
    float rate,simple_interest;
    printf("Enter Principle,Time and Rate:");
    scanf("%d%d%f",&principle,&time,&rate);
    simple_interest=(principle*rate*time)/100;

    printf("%f",simple_interest);

}