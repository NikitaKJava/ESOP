package at.aau.ESOP.AB3.Exercise1;

import java.util.Scanner;
/**
 * Created by Nikita on 23.03.2021 at 23:10
 */


/**
 * Lesen Sie die int-Variable number ein. Gehen Sie davon aus, dass number größer als 0 ist.
 * Geben Sie die Zahlen von 1 bis number in einer Zeile aus ("Positiver Zahlenstrahl").
 * Geben Sie in der nächsten Zeile die Zahlen -number bis number in einer Zeile aus ("Zahlenstrahl").
 * Verwenden Sie jeweils für beide Ausgaben ein Leerzeichen, um die Zahlen voneinander zu trennen.
 * Verwenden Sie for-Schleifen und folgen Sie dem Format in der Tabelle für die Ausgabe.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //TODO: put your code here
        for(int i = 1; i <= input; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = - input; i <= input; i++) {
            System.out.print(i + " ");
        }
    }
}
