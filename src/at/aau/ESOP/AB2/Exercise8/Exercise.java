package at.aau.ESOP.AB2.Exercise8;

import java.util.Scanner;

/**
 * Created by Nikita on 23.03.2021 at 00:19
 */

/**
 * Ermitteln Sie mit Hilfe einer if-Verzweigung das Minimum und Maximum der Werte der
 * int-Variablen x, y und z und speichern Sie diese in den int-Variablen min bzw. max.
 * Geben Sie das Ergebnis Ihrer Berechnung wie folgt aus:
 * "Maximum = <Wert der Variable max>, Minimum = <Wert der Variable min>"
 * Im Fall, dass der Wert aller Variablen gleich ist, soll "Maximum = Minimum = <Wert der
 * Variablen>" auf der Konsole ausgegeben werden.
 * Hinweis: Verwenden Sie weder java.lang.Math noch java.util.Arrays, um das Minimum und
 * Maximum zu finden.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        //TODO: Put your code here
        int min = 0;
        int max = 0;

        if ( x >= y && x >= z ) {
            max = x;
        }

        if ( y >= x && y >= z ) {
            max = y;
        }

        if ( z >= x && z >= y ) {
            max = z;
        }

        if ( x <= y && x <= z ) {
            min = x;
        }

        if ( y <= x && y <= z ) {
            min = y;
        }

        if ( z <= x && z <= y ) {
            min = z;
        }

        if ( max > min ){
            System.out.println("Maximum = " + max + ", Minimum = " + min);
        }

        if ( max == min ) {
            System.out.println("Maximum = Minimum = " + x);
        }
    }
}