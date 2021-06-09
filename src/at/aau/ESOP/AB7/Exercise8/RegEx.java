package at.aau.ESOP.AB7.Exercise8;

/**
 * Created by Nikita on 10.05.2021 at 18:41
 */
import java.util.Scanner;
public class RegEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String str = in.nextLine();
            printStringClassification(str);
        }
    }
    // TODO - Insert your method here

    /**
     * ^  Beginn einer Zeile
     * $  Ende einer Zeile
     * \b Wortgrenze
     * \B keine Wortgrenze
     * \A Beginn der Eingabe
     * \Z Ende der Eingabe ohne Zeilenabschlusszeichen wie \n oder \r
     * \z Ende der Eingabe mit allen Zeilenabschlusszeichen
     * \G Ende des vorherigen Matches. Sehr speziell für iterative Suchvorgänge
     * \d  Alle Ziffern: [0-9]
     * \D  Alles außer Ziffern
     * \w  Wortzeichen: [a-zA-Z_0-9]
     * \W  Negierung von \w
     *
     * ?      einmal oder gar nicht
     * *      mehrmals oder gar nicht
     * +      mindestens einmal
     * {n}    exakt n-mal
     * {n,}   mindestens n-mal
     * {n,m}  n- bis m-mal
     * . jedes Zeichen
     *
     * @param input
     */

    private static void printStringClassification(String input) {
        String word = "^[a-zA-Z]+$";
        String words = "^[a-zA-Z]+(\\s[a-zA-Z]+)+$";
        String positiveNumber = "^+?[0-9]+(\\.[0-9]+)?$"; // +?
        String negativeNumber = "^-?[0-9]+(\\.[0-9]+)?$";
        String mail = "^[[a-zA-Z]\\.-]+@([a-zA-Z-]+\\.)+[a-zA-Z]+$"; // working: esop-uni@edu.aau.at, esop.uni@edu.aau.at, esop@edu.aau.at not working: esop+uni@edu.aau.at, esop1337@edu.aau.at

        if (input.matches(word)) {
            System.out.println("Die Eingabe ist ein Wort");
        } else if(input.matches(words)) {
            System.out.println("Die Eingabe besteht aus mehreren Wörtern");
        } else if(input.matches(positiveNumber)) {
            System.out.println("Die Eingabe ist eine positive Zahl");
        }else if(input.matches(negativeNumber)) {
            System.out.println("Die Eingabe ist eine negative Zahl");
        } else if(input.matches(mail)) {
            System.out.println("Die Eingabe ist eine E-Mail Adresse");
        } else {
            System.out.println("Die Eingabe konnte nicht klassifiziert werden");
        }
    }
}
