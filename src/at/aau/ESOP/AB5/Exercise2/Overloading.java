package at.aau.ESOP.AB5.Exercise2;

import java.util.Arrays;

/**
 * Created by Nikita on 21.04.2021 at 10:38
 */
public class Overloading {
    public static void main(String[] args) {
        int myInt = 42;
        int[] myArray = null;

        // TODO put your method calls here
        increment(myInt);
//        increment(myArray);
        System.out.println("----------");
        System.out.println(myInt);
//        increment(myArray);

    }

    // TODO put your method definitions here
    static void increment(int myInt) {
        System.out.println(myInt + 1);
    }

    static void increment(int[] myArray) {
        int[] myArray2;

        if (myArray == null) {
            System.out.println("null");;
        } else {
            myArray2 = new int[myArray.length];
            for (int i = 0; i < myArray2.length; i++) {
                myArray2[i] = myArray[i] + 1;
            }

            System.out.println(Arrays.toString(myArray2));
        }
    }
}

