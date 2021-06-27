package at.aau.ESOP.AB10.Exercise4;

import java.util.Objects;

/**
 * Created by Nikita on 08.06.2021 at 23:27
 */
public class capitalizeAllWordsTest{
    public static void main(String[] args) {
//        System.out.println(capitalizeAllWords("heute scheint die sonne."));
//        System.out.println(capitalizeAllWords("A text with more than a thousand words. Really?"));
        System.out.println(capitalizeAllWords(null));
    }

    /**
     * Capitalizes all whitespace-separated words in a String,
     * changing the first letter of each word.
     *
     * @param txt - the string to capitalize
     * @return the capitalized string
     * @throws NullPointerException     if string is null
     * @throws IllegalArgumentException if string is empty
     */
    public static String capitalizeAllWords(String txt) throws NullPointerException, IllegalArgumentException
    //TODO Declare any thrown Exceptions here
    {
        String capitalized = "";
        // TODO Put your code here

        if(txt == null){                                    // checking if is it null always first!!!
            throw new NullPointerException("Null string");
        }

        if(txt.isEmpty() || txt.equals("      ")){
            throw new IllegalArgumentException("Empty string");
        }


        capitalized += Character.toString((txt.charAt(0))).toUpperCase();

        for (int i = 1; i < txt.length(); i++) {
            if(Character.isLetter(txt.charAt(i)) && txt.charAt(i - 1) == ' '){
                capitalized += Character.toString((txt.charAt(i))).toUpperCase();
            } else {
                capitalized += Character.toString((txt.charAt(i)));
            }
        }
        return capitalized;
    }
}
