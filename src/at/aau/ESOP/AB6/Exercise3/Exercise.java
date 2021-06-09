package at.aau.ESOP.AB6.Exercise3;

import java.util.Arrays;
/**
 * Created by Nikita on 03.05.2021 at 23:40
 */

public class Exercise {
    public static void main(String[] args) {

        int[][] array = new int[][]{{1,2,3},{0,1,2},{0,0,1},{1,2,3,5}};

        if(isRectangular(array)){
            System.out.println("Matrix");
        }else{
            System.out.println("Two-dimensional array");
        }
    }

    // TODO define your method here
    static boolean isRectangular(int[][] array){
        if(array == null){
            return false;
        }

        if(array.length == 0){
            return true;
        }

        System.out.println(array.length);

        int length = array[0].length;
        for(int i = 1; i < array.length; i++){
            if(length < array[i].length || length > array[i].length) {
                return false;
            }
            length = array[i].length;
        }
        return true;
    }
}

