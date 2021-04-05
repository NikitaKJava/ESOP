package at.aau.ESOP.AB3.Exercise2;

/**
 * Created by Nikita on 23.03.2021 at 23:10
 */

import java.util.Scanner;

/**
 * Lesen Sie die int-Variable number ein. Gehen Sie davon aus, dass number größer als 0 ist.
 * Geben Sie in einer Positiver Zahlenstrahl die Zahlen number bis 1 aus ("positive Zahlenzeile").
 * Geben Sie in der nächsten Zeile die Zahlen -number bis number als Zahlenstrahl aus.
 * Verwenden Sie jeweils für beide Ausgaben ein Leerzeichen, um die Zahlen voneinander zu trennen.
 *
 * Hinweis: Verwenden Sie while oder do/while Schleifen und folgen Sie dem Format in der Tabelle
 * für die Ausgabe.
 *
 * Überlegung: Was ist der wesentliche Unterschied zur for-Schleife in Aufgabe 1?
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int one = input;
        int two = - input;

        if(one <= 0){
            System.out.println("\n0");
        } else {
            do{
                System.out.print(one + " ");
                one--;
            } while(one >= 1);

            System.out.println();

            do {
                System.out.print(two + " ");
                two++;
            } while (two <= input);
        }
    }
}
