package at.aau.ESOP.AB10.Exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Nikita on 09.06.2021 at 11:17
 */
public class PositiveIntegerDivisor {

    /**
     * Application's entry point
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Positive integer division calculator!");
        //TODO Put your code here
        String user = "y";
        while (user.equals("y")) {

            System.out.println("Enter a dividend:");
            int dividend = keyboard.nextInt();
            System.out.println("Enter a divisor:");
            int divisor = keyboard.nextInt();

            try {
                System.out.println(dividend + " div " + divisor + " = " + Division.positiveIntegerDivision(dividend, divisor));
            } catch (ArithmeticException e) {
                    System.out.println("ERROR: " + e.getMessage()); //try to find out specific reason.
            }

            System.out.println("Again [y/n]?");
            user = keyboard.next().toLowerCase();
        }
        System.out.println("Goodbye!");
    }

    /**
     * Implementieren Sie ein PositiveIntegerDivisor Programm, das zunächst "Positive Integer Division Calculator!" ausgibt,
     * und den Benutzer über die Konsole mit den Fragen "Enter a dividend:" und "Enter a divisor:" nach einem Dividenden und
     * einem Divisor (zwei positive Integer im Wertebereich ℤ+={0; 1; ...; 2147483647}) fragt.  Das Programm dividiert sie dann
     * und gibt das Ergebnis auf der Konsole aus (im Format <num1> div <num2> = <result>).
     * <p>
     * Danach wird der Benutzer gefragt, ob er die Zahlen erneut dividieren möchte (Again [y/n]?). Wenn 'n' oder 'N' eingegeben
     * wird, wird das Programm beendet (mit der Ausgabe von "Goodbye!"). Wird 'y' oder 'Y' eingegeben, beginnt das Programm
     * wieder mit der Frage nach der Eingabe von Zahlen. Wird eine andere Eingabe getätigt, wird die Frage erneut gestellt
     * (bis die Eingabe n/N oder y/Y ist).
     * <p>
     * Bei einer fehlerfreien Eingabe produziert das Programm die folgenden Ausgaben:
     * <p>
     * >> Positive integer division calculator!
     * >> Enter a dividend:
     * >> 2
     * >> Enter a divisor:
     * >> 1
     * >> 2 div 1 = 2
     * >> Again [y/n]?
     * >> n
     * >> Goodbye!
     * <p>
     * Verwenden Sie für die Eingabe die Scanner Klasse und stellen Sie sicher, dass durch eine Fehleingabe die ausgelöste
     * InputMismatchException abgefangen und das Programm nicht terminiert wird.
     * Im Falle einer InputMismatchException geben Sie zusätzlich den Text "ERROR: Not an integer" auf der Konsole aus.
     * Verwenden Sie für die Division die zur Verfügung gestellte Methode
     * public static int positiveIntegerDivision(int dividend, int divisor) throws ArithmeticException der Klasse  Division.
     * Analysieren Sie die Methode positiveIntegerDivision und stellen Sie ebenfalls sicher, dass die ArithmeticException
     * abgefangen und das Programm nicht terminiert wird. Im Falle einer ArithmeticException geben Sie zusätzlich entweder
     * den Text "ERROR: Division by zero" oder "ERROR: Division with negative integers" auf der Konsole aus.
     * <p>
     * Hinweis:
     * <p>
     * Im CodeRunner wird eine Benutzereingabe simuliert, im Falle einer fehlerhaften Eingabe und einem erneuten Einlesen
     * eines Zeichen wird die NoSuchElementException geworfen, daher ist es hier wichtig dass Sie, bevor Sie eine Eingabe
     * des Benutzers über die Konsole einlesen, mit der Methode hasNext() der Klasse Scanner überprüfen, ob es überhaupt
     * ein Zeichen zum Einlesen gibt.
     * Im Falle einer InputMismatchException achten Sie darauf, dass Sie das falsch eingelesene Zeichen im Scanner wieder
     * entfernen.
     * Sie können davon ausgehen, dass der Buchstabe 'n' für die Terminierung und der Buchstabe 'y' für die Wiederholung
     * des Programms verwendet wird.
     */

    static class Division {
        /**
         * Divides a positive integer by another positive integer without
         * using the division operator and return the resulting quotient.
         *
         * @param dividend - positive integer to be divided
         * @param divisor  - positive integer that divides the dividend
         * @return the quotient - result of the division
         * @throws ArithmeticException - if divisor or dividend are non-negative or divisor is zero
         */
        public static int positiveIntegerDivision(int dividend, int divisor) throws ArithmeticException {
            //check if divisor is zero
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
            //check if dividend or divisor is negative
            if (divisor < 0 || dividend < 0) {
                throw new ArithmeticException("Division with negative integers");
            }

            // result of the division
            int quotient = 0;
            while (dividend >= divisor) {
                dividend = dividend - divisor;
                quotient++;
            }
            return quotient;
        }
    }
}
