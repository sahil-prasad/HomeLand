#include <stdio.h>
<<<<<<< HEAD

int main() {
    int num;
    unsigned long long factorial = 1;

    printf("Enter an integer: ");
    scanf("%d", &num);

    // show error if the user enters a negative integer
    if (num < 0)
        printf("Error! Factorial of a negative number doesn't exist.");
    else {
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        printf("Factorial of %d = %llu", num, factorial);
    }

    return 0;
=======
int recursion(int num){
    if(num<=1)return 1;
    return num * recursion(num-1);
}
void main(){
    int num,ans=0;
    printf("Enter the number: ");
    scanf("%d",&num);
    ans = recursion(num);
    printf("Factorial of %d is %d",num,ans);
>>>>>>> 7a7d351518d8ae83da5657970c585c0f1589ec17
}