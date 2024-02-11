#include <stdio.h>

int main() {
    int num = 20, sum = 0;

    for(int i = 1; i <= num; i++) {
        sum += i;
    }

    printf("Sum of the first %d natural numbers is: %d\n", num, sum);

    return 0;
}