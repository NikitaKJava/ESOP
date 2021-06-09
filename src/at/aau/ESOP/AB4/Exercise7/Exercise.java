package at.aau.ESOP.AB4.Exercise7;

/**
 * Created by Nikita on 07.04.2021 at 13:48
 */

import java.util.Scanner;

/**
 * Der vorgegebene Code liest die ganzen Zahlen a und b sowie die nichtnegative ganze Zahl n ein. Initialisieren Sie das int-Array numbers mit der Größe n und lesen Sie ebenso viele Werte in dieses Array ein.
 * Geben Sie anschließend die Elemente des Arrays in einer Schleife in der gegebenen Reihenfolge aus (mit je einem Leerzeichen Abstand). Beachten Sie dabei jedoch zwei Bedingungen: Ist eine Zahl durch a teilbar,
 * dann soll das darauffolgende Element übersprungen (= nicht ausgewertet und nicht ausgegeben) werden. Ist eine Zahl durch b teilbar (bzw. sowohl durch a als auch durch b), dann sollen die beiden folgenden Elemente
 * übersprungen werden.
 */
public class Exercise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = 2;
//        int a = 3;
        int b = 3;
//        int b = 2;
        int n = 9;

        int[] numbers;

        // TODO Put your code here

        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // 1,2,4,6,9
//        numbers = new int[]{2,5,4,1,9,12,15,16,17,18}; // 2,1,9,15,17,18
//        numbers = new int[]{2, 3, 4, 1, 9, 12, 15, 16, 17,18}; // 2,4,9,16,18

//        for(int i = 0; i < n; i++){
//            numbers[i] = in.nextInt();
//        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

            if (numbers[i] % b == 0) {
                if (i + 2 >= numbers.length) {
                    i = numbers.length-1;
                } else {
                    i += 2;
                }
            }
            else if (numbers[i] % a == 0) {
                i++;
            }
        }
    }
}
