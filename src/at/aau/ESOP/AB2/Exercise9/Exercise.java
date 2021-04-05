package at.aau.ESOP.AB2.Exercise9;

/**
 * Created by Nikita on 23.03.2021 at 00:20
 */

import java.util.Scanner;

/**
 * Wandeln Sie die gegebene switch-Anweisung in eine äquivalente if-Verzweigung um.
 * switch (number) {
 *     case 0:
 *     case 1:
 *     case 2:
 *     case 3:
 *     case 4:
 *         status = "is in the first class";
 *         break;
 *     case 5:
 *     case 6:
 *     case 7:
 *     case 8:
 *     case 9:
 *         status = "is in the second class";
 *         break;
 *     default:
 *         status = "does not belong to any classes";
 * }
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        String status = null;

        //TODO: put your code here
        if(number >= 0 && number <= 4){
            status = "is in the first class";
        }
        if(number >= 5 && number <= 9){
            status = "is in the second class";
        }
        if(number > 9 || number < 0){
            status = "does not belong to any classes";
        }
        System.out.println(number+" "+status);
    }
}
