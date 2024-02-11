<<<<<<< HEAD
#include <stdio.h>

void swap(int* n1, int* n2) {
    int temp;
    temp = *n1;
    *n1 = *n2;
    *n2 = temp;
}

int main() {
    int num1, num2;

    printf("Enter two numbers: ");
    scanf("%d %d", &num1, &num2);

    printf("Before swapping: num1 = %d, num2 = %d\n", num1, num2);

    swap(&num1, &num2);

    printf("After swapping: num1 = %d, num2 = %d\n", num1, num2);

    return 0;
=======
#include<stdio.h>

void swap(int*a,int*b){
    int temp=*a;
    *a=*b;
    *b=temp;
    return;
    
}
void main(){
    int a,b;
    printf("Ënter the two numbers");
    scanf("%d%d",&a,&b);
    printf("Before Swapping,value of a is %d and valueof b is %d\n",a,b);
    swap(&a,&b);
    printf("Äfter Swapping,value of a is %d and value of b is %d\n",a,b);
    
    
>>>>>>> 7a7d351518d8ae83da5657970c585c0f1589ec17
}