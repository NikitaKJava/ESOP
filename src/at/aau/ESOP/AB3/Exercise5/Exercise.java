package at.aau.ESOP.AB3.Exercise5;

import java.util.Scanner;

/**
 * Created by Nikita on 23.03.2021 at 23:11
 */

/**
 * Schreiben Sie eine while-Schleife, welche die Fakultät der Zahl n berechnet und ausgibt.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // TODO Put your code here
        int fak = 1;
        while(n > 1){
            fak *= n;
            n--;
        }

        System.out.println(fak);
    }
}

