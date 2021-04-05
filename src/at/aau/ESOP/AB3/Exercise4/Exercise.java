package at.aau.ESOP.AB3.Exercise4;

import java.util.Scanner;

/**
 * Created by Nikita on 23.03.2021 at 23:11
 */
/**
 * Lesen Sie die drei int-Variablen start, stop und step ein. Für die Testfälle können Sie davon ausgehen, dass stop  gleich oder größer als start ist und step größer als 0 ist.
 *
 * Schreiben Sie nun eine for-Schleife, die mit dem Wert von start beginnt. Erhöhen Sie die Schleifenvariable in jedem Schritt um step und beenden Sie die Schleife, wenn der Wert von stop überschritten wird. In der Schleife geben Sie dann den Wert der Schleifenvariable aus, außer sie ist ein Vielfaches von 3. Ist der aktuelle Wert der Schleifenvariable ein Vielfaches von 3, geben Sie statt der Zahl den String "HOP" aus. Geben Sie Ihre Ergebnisse jeweils innerhalb einer Zeile aus und verwenden Sie Leerzeichen, um die Zahlen voneinander zu trennen. Folgen Sie dem in der Beispieltabelle definierten Format.
 *
 * Überlegung: Prüfen Sie unbedingt in IntelliJ, was passiert, wenn
 *
 *     step gleich 0 ist.
 *     stop kleiner als start ist, während step positiv ist.
 *     stop größer als start ist, während step negativ ist.
 */

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        int step = scanner.nextInt();

        for(int i = start; i <= stop; i+=step) {
            if( i == 0 || i % 3 == 0){
                System.out.print("HOP ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}