package at.aau.ESOP.AB6.Exercise4;
import java.util.Arrays;

/**
 * Created by Nikita on 03.05.2021 at 23:42
 */

public class MinMax {
    public static void main(String[] args) {
        int[][] array2d = new int[][]{{1, 2, 3, 4},
                {5},
                {6, -10, 7, 123, 4},
                {-42, 1337, 1234}};

        // TODO put your method call and output here
        System.out.println(Arrays.toString(findMinMax(array2d)));
    }

    // TODO put your method definition here

//    static int[] findMinMax(int[][] array){
//
//        int min = 0;
//        int max = 0;
//        int[] minmax = new int[array.length];
//
//
//        for(int i = 0; i < array.length; i++){
//
//            if(array == null){
//                return new int[0];
//            }
//
//            if(array.length <= 0 || array[1].length <= 0){
//                return new int[0];
//            }
//
//            min = array[i][0];
//            max = array[i][0];
//            boolean isOdd = false;
//            for(int j = 0; j < array[i].length; j++){
//                if(i % 2 == 0){
//                    isOdd = false;
//                    if(min >= array[i][j]){
//                        min = array[i][j];
//                    }
//                }
//                if(i % 2 != 0){
//                    isOdd = true;
//                    if(max <= array[i][j]){
//                        max = array[i][j];
//                    }
//                }
//                if(!isOdd){
//                    minmax[i] = min;
//                } else {
//                    minmax[i] = max;
//                }
//            }
//
//        }
//        return minmax;
//    }

    static int[] findMinMax(int[][] array){
        int min = 0;
        int max = 0;
        int[] minMax = new int[array.length];

        for(int i = 0; i < array.length; i++){
            min = array[i][0];
            max = array[i][0];

            for(int j = 0; j < array[i].length; j++){
                if(i % 2 == 0){
                    if(min >= array[i][j]){
                        min = array[i][j];
                    }
                } else {
                    if(max <= array[i][j]){
                        max = array[i][j];
                    }
                }
            }

            if(i % 2 == 0){
                minMax[i] = min;
            } else {
                minMax[i] = max;
            }
        }
        return minMax;
    }
}