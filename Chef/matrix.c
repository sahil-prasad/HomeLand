#include<stdio.h>
#include<conio.h>
void main(){
    int i,j,matrix1[3][3],matrix2[3][3],res[7][9],rows,cols;
    printf("Eneter the number of rows and columns");
    scanf("%d%d",&rows,&cols);
    printf("Enter the elements of 1st matrix");
    for(i=0;i<rows;i++)
    for(j=0;j<cols;j++)
    scanf("%d",& matrix1[i][j]);
    printf("Enter the elemsnts of 2nd matrix");
    for(i=0;i<rows;i++)
    for(j=0;j<cols;j++)
    scanf("%d",& matrix2[i][j]);
    for(i=0;i<rows;i++)
    for(j=0;j<cols;j++)
    res[i][j]= matrix1[i][j]+matrix2[i][j];
    printf("the resultant matrix is");
    for(i=0;i<rows;i++)
    for(j=0;j<cols;j++)
    printf("%d",res[i][j]);


}