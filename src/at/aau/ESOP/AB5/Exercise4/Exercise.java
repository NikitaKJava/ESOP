package at.aau.ESOP.AB5.Exercise4;

/**
 * Created by Nikita on 21.04.2021 at 18:37
 */
import java.util.Arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        char[] array1= { 'E', 'S', 'O', 'P' };
        char[] array2 = { 'J', 'a', 'v', 'a' };

        boolean equal;
        // To call your method here
        equal = compare(array1, array2);

        if(equal){
            System.out.println("Arrays are equal!");
        }else{
            System.out.println("Arrays are different!");
        }
    }

    // TODO define your method here
    static boolean compare(char[] arr1, char[] arr2){
        if(arr1 == null && arr2 == null){ // always checking if ist not null first!!!
            return true;
        }

        if(arr1 == null && arr2.length > 0){ // operation for array is null and secons array is not null
            return false;
        }

        if(arr2 == null && arr1.length > 0){ // operation for second array is null and first array is not null
            return false;
        }

        if(arr1.length != arr2.length){ // checking if two arrays have different lengths
            return false; // if not return false that arrays are equal
        } else {
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false; // if first condition is true then return false and end the loop
                }
            }
        }
        return true; // default return is always needed
    }
}




