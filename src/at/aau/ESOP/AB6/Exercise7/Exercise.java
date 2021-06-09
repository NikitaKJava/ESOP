package at.aau.ESOP.AB6.Exercise7;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {

        int[][] matrix1 = new int[][]{{3,2,1},{1,0,2}};
        int[][] matrix2 = new int[][]{{1,2},{0,1},{4,0}};

        // TODO call multiply method here and output the result
        System.out.println(Arrays.deepToString(multiply(matrix1, matrix2)));
    }


    // TODO define your methods here
    static int[][] multiply(int[][] a, int[][] b){

        if(!checkDimensions(a, b)){
            System.out.println("Matrix Multiplication not possible.");
            return new int[0][0];
        } else {

            int[][] mult = new int[a.length][b[0].length];

            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < b[0].length; j++){
                    for(int k = 0; k < a[0].length; k++) {
                        mult[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return mult;
        }
    }

    static boolean checkDimensions(int[][] a, int[][] b){

        if(checkRectangular(a) && checkRectangular(b)){
            if(a.length > 0  && a[0].length == b.length){
                return true;
            }
        }
        return false;
    }

    static boolean checkRectangular(int[][] a){
        int length = 0;

        if(a.length > 0){
            length = a[0].length;
        }

        for(int i = 0; i < a.length; i++){
            if(a[i].length != length){
                return false;
            }
        }
        return true;
    }
}