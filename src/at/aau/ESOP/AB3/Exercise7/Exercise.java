package at.aau.ESOP.AB3.Exercise7;

/**
 * Created by Nikita on 23.03.2021 at 23:11
 */

import java.util.Scanner;

/**
 * Schreiben Sie eine for-Schleife, welche die Fibonacci-Zahlen F0 bis Fn berechnet und Fn
 * ausgibt. Fibonacci-Zahlen werden wie folgt berechnet:
 * <p>
 * F0=0,F1=1,Fn=Fn−2+Fn−1
 * <p>
 * Die ersten Fibonacci-Zahlen wären demnach 0, 1, 1 (= F0+F1), 2 (= F1+F2), 3 (= F2+F3).
 * Für nähere Informationen sei der englischsprachige Wikipedia-Artikel empfohlen.
 * Für ungültige Eingabewerte für n geben Sie bitte den String "Invalid" aus.
 */
public class Exercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // TODO Put your code here
        int fib0 = 0;
        int fib1 = 1;
        int fibn = 0;

        if(n < 0){
            System.out.println("Invalid");
        }
        if(n == 0){
            System.out.println(fib0);
        }
        if(n == 1){
            System.out.println(fib1);
        }
        if(n > 1) {
            for(int i = 1; i < n; i++){
                fibn = fib0 + fib1;
                fib0 = fib1;
                fib1 = fibn;
            }
            System.out.println(fibn);
        }
    }
}
