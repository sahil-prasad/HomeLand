//to find biggest element in the array
#include<stdio.h>
#include<conio.h>
void main()
{
    int big,b,num[99];
    printf("Enter the number of elements: ");
    scanf("%d",&num);
    printf("Enter the number of elements one by one: ");
    for(int i=0;i<num;i++)
    {
        scanf("%d",&b);
    }
    big=num[0];
    for(int j=0;j<num;j++)
    {
        if(big<num[0])
        {
            big=num[j];
        }
        printf("the biggest number is %d", big);
    }
}
