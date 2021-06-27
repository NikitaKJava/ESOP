package at.aau.ESOP.AB10.Exercise5;

/**
 * Created by Nikita on 09.06.2021 at 10:21
 */
public class Exercise {
    public static void main(String[] args) {
        System.out.println(stringToInt("2147483647"));
        System.out.println(stringToInt("a01"));
        System.out.println(stringToInt("-1"));
        System.out.println(stringToInt("00001"));

    }
    /**
     * Implementieren Sie eine statische Methode stringToInt(str) die einen String als Argument übernimmt und die darin
     * enthaltene ganze Zahl als int zurückgibt. In dem Fall, dass die übergebene Zeichenkette keiner ganzen Zahl entspricht,
     * wirft diese Methode eine IllegalArgumentException.
     * Tipps:
     *     Für die Umwandlung verwenden Sie Integer.parseInt(String str) die im Falle einer fehlerhaften Eingabe eine
     *     NumberFormatException wirft.
     *     Fangen Sie diese Exception ab und werfen Sie stattdessen die IllegalArgumentException mit der Fehlermeldung
     *     "Invalid integer".
     */

    /**
     * Converts a String to an integer.
     *
     * @param str the string to be converted
     * @return the integer represented by the string
     * @throws IllegalArgumentException if the string does not contain a parsable integer
     */
    public static int stringToInt(String str) throws IllegalArgumentException {
        int number = 0;
        //TODO Put your code here
        try {
            number = Integer.parseInt(str);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid integer", e);
        }
        return number;
    }
}
