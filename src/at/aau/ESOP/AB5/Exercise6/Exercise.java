package at.aau.ESOP.AB5.Exercise6;

import java.util.Locale;

/**
 * Created by Nikita on 21.04.2021 at 19:14
 */
public class Exercise {

    public static void main(String[] args) {
        String[] input0  = new String[] { "Like","i","am","going","to","create","like","a","program" };
        String[] input1  = new String[] { "a","computer","lets","you","make","mistakes","faster","than","any","other","invention","in","human","history" };

        // TODO put the call and output here (for input0 and "like")
        String[] result0 = deleteElements(input0, "like");
        // TODO put the call and output here (for input1 and "mistakes")
        String[] result1 = deleteElements(input1, "mistakes");

        for(String i : result0){
            System.out.print(i + " ");
        }

        System.out.println();

        for(String i : result1){
            System.out.print(i + " ");
        }
    }

    // TODO define your method here
    static String[] deleteElements(String[] array, String element) {

        int count = 0;

        for(String i : array){
            if(!i.toLowerCase().equals(element)){
                count++;
            }
        }

        String[] result = new String[count];
        int j = 0;

        for(String i : array){
            if(!i.toLowerCase().equals(element)){
                result[j++] = i;
            }
        }
        return result;
    }
}