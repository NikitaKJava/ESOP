package at.aau.ESOP.AB2.Exercise1;

/**
 * Created by Nikita on 17.03.2021 at 19:21
 */

import java.util.Scanner;

/**Lesen Sie zwei Zahlen (Zähler dividend und Nenner divisor)  ein und geben Sie das Ergebnis der Division aus. Was passiert, wenn der Nenner 0 ist?
 *Überprüfen Sie daher, ob der Nenner 0 ist und geben Sie (falls notwendig) die Meldung "The divisor must be non-zero!" aus.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dividend = scanner.nextDouble();
        int divisor = scanner.nextInt();

        //TODO: Put your code here
        if(divisor > 0){
            System.out.println(dividend / divisor);
        } else {
            System.out.println("The divisor must be non-zero!");
        }
    }
}
