package at.aau.ESOP.AB6.Exercise2;

/**
 * Created by Nikita on 28.04.2021 at 19:00
 */
import java.util.Arrays;

public class Linearisation {
    public static void main(String[] args) {
//        int[][] array2d = new int[][]{{1, 2},{3, 4, 5}};
        int[][] array2d = new int[][]{{2, 0, 7, 5},{5, 9, 5, 8, 6},{1, 2}};
        // TODO put your method call and output here
//        System.out.println(array2d[1][1]);

        System.out.println(Arrays.toString(convert2DTo1D(array2d)));

    }
    // TODO put your method definition here
//    static int[] convert2DTo1D(int[][] array2D){
//        int k = 0;
//        int l = 0;
//        for(int i = 0; i < array2D.length; i++){
//            for(int j = 0; j < array2D[l].length; j++){
//                k++;
//            }
//            l++;
//        }
//
//        int[] converted = new int[k];
//
//
//
//        k = 0;
//        l = 0;
//        for(int i = 0; i < array2D.length; i++){
//            for(int j = 0; j < array2D[l].length; j++){
//                converted[k++] = array2D[i][j];
//            }
//            l++;
//        }
//        return converted;
//    }

    static int[] convert2DTo1D(int[][] array2D){
        if(array2D == null){
            return new int[0];
        }
        int length = 0;

        for(int i = 0; i < array2D.length; i++){
            for(int j = 0; j < array2D[0].length; j++){
                length++;
            }
        }

        System.out.println(length);

        int[] array = new int[length];
        int count = 0;

        for(int i = 0; i < array2D.length; i++){
            for(int j = 0; j < array2D[0].length; j++){
                array[count++] = array2D[i][j];
            }
        }
        return array;
    }
}
