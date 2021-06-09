package at.aau.ESOP.AB4.Exercise4;

import java.util.Scanner;

/**
 * Created by Nikita on 07.04.2021 at 13:46
 */

/**
 * Der vorgegebene Code liest die positive ganze Zahl length ein. Initialisieren Sie die folgenden Arrays mit der Länge length. Geben Sie dann in einer Schleife den Inhalt jedes Arrays in je einer Zeile aus, wobei die einzelnen Elemente durch Leerzeichen getrennt sind.
 * Variable 	Beschreibung
 * intArray 	Ein Array von int Variablen mit der Länge length
 * floatArray
 *
 * Ein Array von float Variablen mit der Länge length
 * booleanArray
 *
 * Ein Array von boolean Variablen mit der Länge length
 */
public class Exercise {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        //TODO: put your code here
        int[] intArray = new int[length];
        float[] floatArray = new float[length];
        boolean[] booleanArray = new boolean[length];

        for(int i = 0; i < length; i++){
            System.out.print(intArray[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < length; i++){
            System.out.print(floatArray[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < length; i++){
            System.out.print(booleanArray[i] + " ");
        }
    }
}
