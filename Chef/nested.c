#include<stdio.h>
void main()
{
    int i=1,j=1;
    while(i<=3)
    {
        while(j<=3)
        {
            printf("%d%d",i,j);
            j++;
        }
        i++;
    }
}