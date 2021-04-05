package at.aau.ESOP.AB2.Exercise3;

/**
 * Created by Nikita on 23.03.2021 at 00:14
 */

import java.util.Scanner;

/**
 * Lesen Sie eine int Variable truth ein und geben Sie den dazugehörigen Wahrheitswert aus.
 * Machen Sie sich hierfür mit switch-Anweisungen vertraut und verwenden Sie diese!
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int truth = scanner.nextInt();

        //TODO: Put your code here
        switch(truth) {
            case 0:
                System.out.println("False");
                break;
            case 1:
                System.out.println("True");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
