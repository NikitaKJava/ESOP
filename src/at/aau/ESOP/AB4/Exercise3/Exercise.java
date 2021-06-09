package at.aau.ESOP.AB4.Exercise3;

import java.util.Scanner;

/**
 * Created by Nikita on 07.04.2021 at 13:45
 */
class NumberPattern {
    public static void main(String[] args) {

        // TODO Put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = number; i > 0; i -= 2){
            for(int j = i; j > 0; j-= 2){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
