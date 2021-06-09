package at.aau.ESOP.AB6.Exercise5;

/**
 * Created by Nikita on 04.05.2021 at 23:14
 */
import java.util.Arrays;

public class Exercise {
    public static void main(String[] args){
        int[][] myMatrix = {    {1,2,3,4},
                                {17,9,5,6},
                                {1,1,1,1},
                                {7,6,5,4}};

        int[] diagonal = getDiagonal(myMatrix);
        System.out.println(Arrays.toString(diagonal));
    }

    //TODO define your method here
    static int[] getDiagonal(int[][] matrix){

        if(matrix == null || matrix.length < 3){
            return new int[0];
        }

        if(matrix.length <= 0 || matrix[1].length <= 0){
            return new int[0];
        }


        int k = 0;
        int[] dia = new int[matrix.length];

        for(int i = 0; i < matrix.length; i++){
            dia[k] = matrix[i][k];
            k++;
        }
        return dia;
    }
}
