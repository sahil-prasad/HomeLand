#include < stdio.h>

#include < conio.h>

void main(0£

int num,num2;

FILE *fptr;

fptr = fopen("filename.txt", "W");

printf("Enter two number:");

fputc(r,fptr);

fgetc(fptr);

printf("\n");

scanf("%d%d", &num, &num2);

fprintf(fptr,"%d%d", &num, &num2);

fscanf(fptr, "%d",num);
fclose(fptr);
}