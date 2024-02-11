#include<stdio.h>
#include<conio.h>
#define pi 3.142
void main()
{
    int r;  /*r-radius of circle*/
    float area_circle;  /*area of circle*/
    printf("Enter radius of circle:");
    scanf("%d", &r);
    area_circle=(pi*r*r);
    printf("%f",area_circle);
}