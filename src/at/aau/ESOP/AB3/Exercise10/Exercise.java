package at.aau.ESOP.AB3.Exercise10;

import java.util.Scanner;

/**
 * Created by Nikita on 23.03.2021 at 22:46
 */

/**
 * Schreiben Sie eine while-Schleife, um int-Zahlen kontinuierlich einzulesen, bis die eingegebene
 * Zahl negativ ist. Betrachten Sie dabei auch 0 als positive Zahl.
 *
 * Und nun zur Ausgabe für jede eingelesene Zahl:
 *
 *     Ist die eingegebene Zahl ein Vielfaches von 3, 4 und 5, geben Sie "_345_" aus.
 *     Ist die eingegebene Zahl ein Vielfaches von 3 und 4, geben Sie "_34_" aus.
 *     Ist die eingegebene Zahl ein Vielfaches von 3 und 5, geben Sie "_35_" aus.
 *     Ist die eingegebene Zahl ein Vielfaches von 4 und 5, geben Sie "_45_" aus.
 *     Ist die eingegebene Zahl ein Vielfaches von 3, geben Sie "_3_" aus.
 *     Ist die eingegebene Zahl ein Vielfaches von 4, geben Sie "_4_" aus.
 *     Ist die eingegebene Zahl ein Vielfaches von 5, geben Sie "_5_" aus.
 *     Ist die eingegebene Zahl kein Vielfaches, geben Sie lediglich die Zahl selbst aus.
 *
 * Geben Sie alle Teilergebnisse innerhalb einer Zeile aus und verwenden Sie ein Leerzeichen,
 * um die einzelnen Ergebnisse voneinander zu trennen. Folgen Sie also dem Format in der untenstehenden
 * Beispieltabelle.
 *
 * Anmerkung:
 *
 * Lösen Sie zuerst das Problem, eine Zahl nach der anderen vom Scanner einzulesen. Kümmern Sie sich
 * danach um die Teilbarkeit. Hier empfiehlt es sich jedenfalls, die Lösung zuerst mit IntelliJ zu
 * probieren.
 */
public class Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while(input >= 0) {

            if((input % 3 == 0) && (input % 4 == 0) && (input % 5 == 0)) { // or 3*4*5
                System.out.print("_345_ ");
            }

            else if(input % 3 == 0 && input % 4 == 0) { // or 3*4
                System.out.print("_34_ ");
            }

            else if(input % 4 == 0 && input % 5 == 0) { // 4*5
                System.out.print("_45_ ");
            }

            else if(input % 3 == 0 && input % 5 == 0) { // 3*5
                System.out.print("_35_ ");
            }

            else if(input % 3 == 0) {
                System.out.print("_3_ ");
            }

            else if(input % 4 == 0) {
                System.out.print("_4_ ");
            }

            else if(input % 5 == 0) {
                System.out.print("_5_ ");
            } else {
                System.out.print(input + " ");
            }

            input = scanner.nextInt();

        }
    }
}
