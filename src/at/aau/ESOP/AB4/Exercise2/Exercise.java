package at.aau.ESOP.AB4.Exercise2;

import java.util.Scanner;

/**
 * Created by Nikita on 07.04.2021 at 13:45
 */
public class Exercise {
    public static void main(String[] args) {

        // TODO Put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++){ // Lines
            for(int j = 1; j <= i; j++){ // Stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
