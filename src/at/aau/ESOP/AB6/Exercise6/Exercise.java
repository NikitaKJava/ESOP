package at.aau.ESOP.AB6.Exercise6;

/**
 * Created by Nikita on 05.05.2021 at 18:08
 */
public class Exercise {

    static int[][] matrix = new int[][] {   {1,0,0,0,0},
                                            {2,8,0,0,0},
                                            {5,3,1,0,0},
                                            {0,1,3,2,0},
                                            {1,9,1,1,2} };

    public static void main(String[] args) {

        if(isLowerTriangular(matrix)){
            System.out.println("The matrix is lower triangular!");
        }else{
            System.out.println("The matrix is NOT lower triangular!");
        }

    }

    // TODO define your method here
    static boolean isLowerTriangular(int[][] matrix){
        if(matrix == null || matrix.length <= 0){
            return true;
        }

        boolean isTri = false;
        for(int i = 0; i < matrix.length-1; i++){
            int j = 1;
            if(matrix[i][j+i] == 0){
                isTri = true;
            } else {
                isTri = false;
            }
            j++;
        }
        return isTri;
    }
}