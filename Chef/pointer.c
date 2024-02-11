#include<stdio.h>
#include<conio.h>
void main(){
    float b[6],*p;
    int a,n;
    printf("Enter the size of the array");
    scanf("%d",&n);
    printf("Enter the values of the array");
    for(a=1;a<n-1;a++)
    scanf("%f",&b[a]);
    p=&b[0];
    for(a=0;a<=n-1;a++)
    {
        printf("%f",*p);
        p++;
    }
}