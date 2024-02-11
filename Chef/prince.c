#include<stdio.h>
#include<conio.h>
void main()
{
    char clerk;
    int bs,hra,da,total_salary=0;
    printf("whether a clerk:y/n");
    scanf("%c",&clerk);
    printf("enter basic salary:");
    scanf("%d",bs);
    if (clerk == 'y')
    {
        hra = 0;
    }
    else if (clerk == 'n')
    {
        hra = (8 * bs)/100;   
    }
    }
    else if (bs <= 3000)
    {
        da = (70 * bs)/100;
    }
    else if (bs > 3000)
    {
        da = (85 * bs)/100;   
    }
    else{
        printf("enter correct value");
    }
    total_salary = (bs + hra + da);
    printf("total salary is %d",total_salary);

    // getch();
}
