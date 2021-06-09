package at.aau.ESOP.AB6.Exercise1;

/**
 * Created by Nikita on 28.04.2021 at 18:29
 */
public class Exercise {
    public static void main(String[] args) {
        //TODO put your code here
        printArray(initArray(1,1), ".");
        System.out.println();
        printArray(initArray(2,2), " | ");
        System.out.println();
        printArray(initArray(3,5), " ");
    }

    static int[][] initArray(int rows, int columns) {
        //TODO implement your method here

        int[][] matrix = new int[rows][columns];
        int k = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = k++;
            }
        }
        return matrix; // change to the real return value!
    }

    static void printArray (int[][] array, String separator) {
        //TODO implement your method here

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + separator);
            }
            System.out.println();
        }
    }
}