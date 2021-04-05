package at.aau.ESOP.AB3.Exercise9;

import java.util.Scanner;

/**
 * Created by Nikita on 23.03.2021 at 23:11
 */

/**
 * Schreiben Sie das Programm, das zwei int-Variablen, number1 und number2, einliest.
 * Verwenden Sie eine for-Schleife,  um die Zahlen von 100 bis einschließlich 1 auszugeben,
 * beachten Sie aber:
 *      Wenn die Schleifenvariable eine Multiplikation der beiden Zahlen number1 und number2
 *          ist, beenden Sie die Schleife.
 *     Wenn die Schleifenvariable entweder durch number1 oder number2 teilbar ist,
 *          geben Sie den Wert nicht aus, setzen die Schleife aber fort.
 * Drucken Sie die Zahlen in einer Zeile und verwenden Sie Leerzeichen, um die Zahlen
 * voneinander zu trennen. Folgen Sie dem in der Tabelle definierten Format.
 *
 * Überlegung: Wofür benötigt man continue? Wofür kann man break einsetzen?
 * Überlegen Sie sich Anwendungsfälle und probieren Sie diese im IntelliJ aus.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        for(int i = 100; i > 0; i--){
            if ( i == (number1 * number2)){
                break;
            }
            if( i % number1 == 0 || i % number2 == 0){
                System.out.print("");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}