package at.aau.ESOP.AB3.Exercise3;

import java.util.Scanner;

/**
 * Created by Nikita on 23.03.2021 at 23:14
 */
public class Exercise {
    /**
     * Schreiben Sie eine while-Schleife, welche die ersten n geraden Zahlen in einer Zeile
     * und mit je einem Leerzeichen Abstand ausgibt.
     * Geben Sie zusätzlich in der nächsten Zeile die Summe aller ausgegebenen Zahlen aus.
     * Tipp: 0 ist eine gerade Zahl, siehe: https://en.wikipedia.org/wiki/Parity_of_zero#Why_zero_is_even
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // TODO Put your code here
        int zero = 0;
        int step = 1;
        int sum = 0;

        while (step <= n) {
            System.out.print(zero + " ");
            sum += zero;
            zero += 2;
            step++;
        }

        System.out.println("\n" + sum);
    }
}
