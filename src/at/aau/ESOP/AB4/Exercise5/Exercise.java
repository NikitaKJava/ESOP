package at.aau.ESOP.AB4.Exercise5;

import java.util.Scanner;

/**
 * Created by Nikita on 07.04.2021 at 13:48
 */

/**
 * Der vorgegebene Code liest die nichtnegative ganze Zahl n ein. Initialisieren Sie das int-Array numbers mit der Größe n und lesen Sie ebenso viele Werte in dieses Array ein. Geben Sie den Inhalt des Arrays anschließend in einer Schleife aus, wobei die einzelnen Elemente durch einen Beistrich getrennt sein sollen.
 *
 * Tipp: Achten Sie bei n == 0 darauf, dass keine Zahl eingelesen werden muss.
 */
public class Exercise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // TODO Put your code here
        int[] numbers = new int[n];

        if(n == 0){
            System.out.println("");
        } else {

            for(int i = 0; i < n; i++){
                numbers[i] = in.nextInt();
            }

            for(int i = 0; i < n; i++){
                if(i != n - 1) {
                    System.out.print(numbers[i] + ",");
                } else {
                    System.out.print(numbers[i]);
                }
            }
        }
    }

}