package at.aau.ESOP.AB5.Exercise7;
import java.util.Arrays;

/**
 * Created by Nikita on 27.04.2021 at 23:06
 */

/**
 * Gegeben sei folgender Programmcode. Schreiben Sie die Methode intersection, welche zwei int-Arrays als Parameter übernimmt und die Elemente, welche die beiden Arrays gemeinsam haben (Schnittmenge), in einem neuen Array zurückgibt. Der Rückgabewert Ihrer Funktion soll ein neues int-Array sein, welches das Ergebnis der Methode beinhaltet. Sollten die beiden übergebenen Arrays keine gemeinsamen Elemente beinhalten, so soll ein leeres Array zurückgegeben werden.
 * Sie können davon ausgehen, dass keines der Arrays null ist.
 * Tipp: verwenden Sie auch das Schlüsselwort static in der Methodendeklaration.
 * Hinweis: Keines der Eingabe-Arrays enthält doppelte Elemente. Die Reihenfolge der Elemente im Ergebnis-Array ist nicht wichtig. Bitte betrachten Sie ein leeres Array als ein Array mit der Länge 0.
 *
 * Eingabe                                  Ausgabe
 * int[] array1 = {1, 2, 3, 4, 5};
 * int[] array2 = {9, 6, 4, 2, 0, 12};      [2, 4]
 *
 * int[] array1 = {1, 2, 3, 4, 5};
 * int[] array2 = {11, 12, 13};               []
 */
public class Exercise {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{9, 6, 4, 2, 0, 12};

        int[] resultArray = intersection(array1, array2);

        System.out.println(Arrays.toString(resultArray));
    }

    // TODO define your method here
    static int[] intersection(int[] array1, int[] array2){
        int count = 0;

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    count++;
                }
            }
        }

        int[] array = new int[count];
        int k = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    array[k] = array1[i];
                    k++;
                }
            }
        }

        return array;
    }
}
