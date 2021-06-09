package at.aau.ESOP.AB7.Exercise4;

/**
 * Created by Nikita on 10.05.2021 at 20:11
 */
import java.util.Scanner;
public class MorseCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(convertToMorseCode(input));
    }

    /**
     * This method encodes a given text in international morse code. (https://en.wikipedia.org/wiki/Morse_code)
     *
     * @param input Input String as plain text (always in upper case)
     * @return String encoded as morse code
     */
    static String convertToMorseCode(String input) {
        // TODO - Insert your code here
        if (input == null || input.isEmpty()) {
            return null;
        }
        String morse = "";
        for (int i = 0; i < input.length(); i++) {
            morse = morse + charToMorseSymbol(input.charAt(i)) + "   ";
        }

        return morse;
    }

    /**
     * This method converts a single character to its morse code representation. If no morse code for the character
     * exists, an empty string is return morseed.
     *
     * @param ch Input character to encode
     * @return Morse code representation of the given character
     */
    static String charToMorseSymbol(char ch) {
        // TODO - Insert your code here
        String morse;
        // International Morse Code
        switch (ch) {
            case 'A':
                return morse = ".-";
            case 'B':
                return morse = "-...";
            case 'C':
                return morse = "-.-.";
            case 'D':
                return morse = "-..";
            case 'E':
                return morse = ".";
            case 'F':
                return morse = "..-.";
            case 'G':
                return morse = "--.";
            case 'H':
                return morse = "....";
            case 'I':
                return morse = "..";
            case 'J':
                return morse = ".---";
            case 'K':
                return morse = "-.-";
            case 'L':
                return morse = ".-..";
            case 'M':
                return morse = "--";
            case 'N':
                return morse = "-.";
            case 'O':
                return morse = "---";
            case 'P':
                return morse = ".--.";
            case 'Q':
                return morse = "--.";
            case 'R':
                return morse = ".-.";
            case 'S':
                return morse = "...";
            case 'T':
                return morse = "-";
            case 'U':
                return morse = "..-";
            case 'V':
                return morse = "...-";
            case 'W':
                return morse = ".--";
            case 'X':
                return morse = ".--";
            case 'Y':
                return morse = "-.--";
            case 'Z':
                return morse = "--..";
            case '1':
                return morse = ".----";
            case '2':
                return morse = "..---";
            case '3':
                return morse = "...--";
            case '4':
                return morse = "....-";
            case '5':
                return morse = ".....";
            case '6':
                return morse = "-....";
            case '7':
                return morse = "--...";
            case '8':
                return morse = "---..";
            case '9':
                return morse = "----.";
            case '0':
                return morse = "-----";
            case ' ':
                return morse = " ";
            default:
                morse = "";
        }
        return morse;
    }
}
