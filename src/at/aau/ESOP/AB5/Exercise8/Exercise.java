package at.aau.ESOP.AB5.Exercise8;

import java.util.Arrays;

/**
 * Created by Nikita on 22.04.2021 at 13:30
 */
public class Exercise {
    public static void main(String[] args) {
        int[] sorted1 = new int[] { 0,2,2,4,6,16 }; //6
        int[] sorted2 = new int[] { 1,2,2,3,10 }; // 5 -> 11
        //TODO put your code here
        int[] concat = combine(sorted1, sorted2);
        for (int i : concat) {
            System.out.print(i + " ");
        }
    }

    static int[] combine( int[] sorted1,  int[] sorted2) {
        // TODO implement your method here
        if(!isSorted(sorted1) || !isSorted(sorted2)) {
            System.out.println("Arrays not sorted. Canceled.");
            return new int[0];
        }

        int[] combined = new int[sorted1.length + sorted2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // ternary operator to sort both arrays
        while(i < sorted1.length && j < sorted2.length){
            combined[k++] = (sorted1[i] < sorted2[j] ? sorted1[i++] : sorted2[j++]); // boolean Expression ? expression 1 : expression 2
        }

//        System.out.println(Arrays.toString(sorted1));
//        System.out.println(Arrays.toString(sorted2));
//        System.out.println(Arrays.toString(combined));

        // copy last item from sorted1 or sorted2 arrays
        while (i < sorted1.length) {
            combined[k++] = sorted1[i++];
        }

        while (j < sorted2.length) {
            combined[k++] = sorted2[j++];
        }
        return combined;
    }

    static boolean isSorted(int[] array) {
        // TODO implement your method here
        if(array.length == 0){
            return false;
        }
        int min = array[0];
        boolean isSorted = true;
        for(int i = 0; i < array.length; i++){
            if(min > array[i]) {
                return isSorted = false;
            }
            min = array[i];
        }
        return isSorted; // change to the real return value!
    }
}
