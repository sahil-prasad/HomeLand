#include<stdio.h>
void main()
{
    int x,i,j;
    printf("enter the number yrr: ");
    scanf("%d",&x);
    for ( i=1 ; i <= x ; i++ )
    {
        for ( j=1 ; i <= j ; j++ )
        {
            printf("*");
            if ( i == j)
            {
                printf("\n");
            }
            
        }
        
    }
    
}