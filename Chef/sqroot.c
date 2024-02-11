#include <stdio.h>
#include <math.h>

int main() {
    double num;
    printf("Enter a number: ");
    scanf("%lf", &num);

    double sqrt_val = sqrt(num);
    printf("Square root of %.2lf is: %.2lf\n", num, sqrt_val);

    return 0;
}