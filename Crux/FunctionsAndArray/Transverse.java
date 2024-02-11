package FunctionsAndArray;

import java.util.Scanner;

public class Transverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols  = sc.nextInt();
        int [] [] Matrix = new int[rows][cols];
//        int [] [] Matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int [][] Transverse = {
//                {1,4,7},
//                {2,5,8},
//                {3,6,9}
//        };
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                Matrix  [i] [j]  = sc.nextInt();
            }
        }
        int [][] ans = new int[cols][rows];

        for (int i = 0; i <Matrix.length ; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                ans [i][j] = Matrix[j][i] ;
            }
        }
        for (int i = 0; i <Matrix.length ; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
