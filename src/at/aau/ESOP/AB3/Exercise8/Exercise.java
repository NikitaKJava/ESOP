package at.aau.ESOP.AB3.Exercise8;

/**
 * Created by Nikita on 23.03.2021 at 23:11
 */

import java.util.Scanner;

/**
 * Lesen Sie mit Hilfe einer while-Schleife so lange int-Zahlen ein, bis die
 * eingegebene Zahl negativ ist. Betrachten Sie 0 als positive Zahl.
 * Berechnen Sie die Summe der eingegebenen Werte (ohne die letzte negative Zahl)
 * und speichern Sie sie in der int-Variable sum. Berechnen Sie dann den double-Mittelwert
 * dieser Werte und geben Sie Folgendes aus:
 *
 * sum = <sum>, average = <average>
 *
 * Für die Testfälle können Sie davon ausgehen, dass der erste Wert positiv ist.
 *
 * Hinweis: Überlegen Sie, was Sie zur Berechnung des Durchschnitts brauchen.
 *
 * Überlegen Sie: Was passiert in Ihrer Lösung, wenn der erste Wert bereits negativ ist?
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int count = 0;
        int sum = 0;
        while( input >= 0){
            sum += input;
            count++;
            input = scanner.nextInt();
        }

        double average = (double) sum / count; // casting important

        System.out.println("sum = " + sum + ", average = " + average);
    }
}
