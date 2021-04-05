package at.aau.ESOP.AB3.Exercise6;

import java.util.Scanner;

/**
 * Created by Nikita on 23.03.2021 at 23:11
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // TODO Put your code here
        do {
            System.out.print(number % 10);
            number /= 10;
        } while(number > 0);
    }
}