package FunctionsAndArray;


import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [] [] Matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int rows = Matrix.length;
        int cols = Matrix[0].length;
        int [] ans = new int[rows*cols];
        int RowStart = 0;
        int RowEnd = rows -1;
        int ColsStart = 0;
        int ColsEnd = cols-1;
        int f = 0;


        while (RowStart<= RowEnd && ColsStart<= ColsEnd){
            for (int i = ColsStart; i <=ColsEnd ; i++) {
                ans [f] =Matrix[RowStart][i] ;
                f++;
            }
            RowStart++;
            for (int i = RowStart; i <=RowEnd ; i++) {
                ans [f] =Matrix[i][ColsEnd] ;
                f++;
            }
            ColsEnd -- ;
            for (int i = ColsEnd; i >= ColsStart ; i--) {
                ans [f] = Matrix[RowEnd][i] ;
                f++;
            }
            RowEnd--;
            for (int i = RowEnd; i >= RowStart ; i--) {
                ans [f] =Matrix[i][ColsStart] ;
                f++;
            }
            ColsStart++;

        }
        System.out.println(Arrays.toString(ans));


    }
}

