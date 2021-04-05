package at.aau.ESOP.AB2.Exercise4;

/**
 * Created by Nikita on 23.03.2021 at 00:15
 */

import java.util.Scanner;

/**
 * Der Wert der int-Variable number wird eingelesen. Stellen Sie fest, ob der Wert von number
 * positiv oder negativ ist, wobei 0 als positiv gewertet wird. Geben Sie abhängig von Ihrer
 * ersten Prüfung den String "<number> is negative!" oder "<number> is positive" aus.
 * Wenn die Zahl positiv ist, stellen Sie fest, ob der Wert von number gerade oder ungerade
 * ist. Wenn die Zahl positiv ist, geben Sie zusätzlich, abhängig von Ihrem Ergebnis,
 * den String " and even!" oder " and odd!" in einer Zeile aus.
 *
 * Tipp: Überprüfen Sie mit Hilfe des Modulo-Operators (%), ob die Zahl modulo 2 kongruent zu 0 ist.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //TODO: Put your code here
        if(number < 0){
            System.out.println(number + " is negative!");
        }

        if(number >= 0 && number % 2 != 0){
            System.out.println(number + " is positive and odd!");
        }

        if(number >= 0 && number % 2 == 0){
            System.out.println(number + " is positive and even!");
        }
    }
}
