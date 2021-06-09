package at.aau.ESOP.AB7.Exercise6;

/**
 * Created by Nikita on 10.05.2021 at 18:40
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        System.out.println(word + " is " + (isPalindrome(word.toLowerCase()) ? "" : "not ") + "a palindrome");
    }
    //Your method will be put here

    //TODO define your method here
    static boolean isPalindrome(String word) {

        if (word.length() == 0 || word.length() == 1) {
            return true;
        }

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }

        return false;
    }
}