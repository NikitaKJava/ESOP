package at.aau.ESOP.AB7.Exercise3;

/**
 * Created by Nikita on 10.05.2021 at 18:40
 */

import java.util.Scanner;

public class CommaInserterClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String sentence = in.nextLine();

        String sentence = "Es, ist zu hoffen, dass jede(r) diese Aufgabe alleine schaffen wird.";
//        sentence = "Die Tatsache dass das richtig ist, heisst noch lange nicht dass man das tun sollte?";
//        sentence = "Das ist nicht dasselbe.";
//        sentence = "Die Tatsache dass das richtig ist, bedeutet noch lange nicht dass man das tun sollte?";
//        sentence = "Koennen Sie mir sagen ob Sie ein Smartphone haben? Oh! Ich habe vergessen dass Sie soziale Netzwerke nutzen.";

//        System.out.println(sentence.indexOf("dass "));

        System.out.println(insertComma(sentence));
    }

    //TODO define your method here
    static String insertComma(String input){
        if(input == null || input.isEmpty()){
            return null;
        }

        int fromIndex = 0; // if more then one "dass " then will be checked rest of the string
        int indexOf = 0; // index till word begins with "dass "

        while ((indexOf = input.indexOf("dass ", fromIndex)) > 0) {
            if (input.charAt(indexOf - 2) != ',') {
                input = input.substring(0, indexOf - 1) // String from zero till "dass " minus index 1
                        + "," + // puts a comma
                        input.substring(indexOf - 1); // String from index of "dass " minus index 1
            }
            fromIndex = indexOf + 1; // checking rest of a String
        }


        fromIndex = 0;
        while ((indexOf = input.indexOf("ob ", fromIndex)) > 0) {
            if (input.charAt(indexOf - 2) != ',') {
                input = input.substring(0, indexOf - 1) + "," + input.substring(indexOf - 1);
            }
            fromIndex = indexOf + 1;
        }

        return input;
    }
}
