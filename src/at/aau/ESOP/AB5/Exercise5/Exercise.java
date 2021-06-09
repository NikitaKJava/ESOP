package at.aau.ESOP.AB5.Exercise5;

/**
 * Created by Nikita on 21.04.2021 at 18:55
 */

/**
 * Erstellen Sie eine statische Methode getDistance(), die zwei boolean-Arrays
 * entgegennimmt und den Hamming-Abstand davon als int-Wert zurückgibt.
 * Der boolesche Wert true steht für Bit 1, der Wert false für Bit 0.
 * Die Hamming-Distanz ist die Anzahl der unterschiedlichen Positionen in den Arrays.
 * Wenn die Länge der Arrays nicht gleich ist oder eines der Arrays (eines oder beide)
 * null ist, kann eine Hamming-Distanz nicht berechnet werden. In diesem Fall wird -1
 * zurückgegeben.
 *
 * Rufen Sie in der main-Methode die Methode auf, um der Variable distance einen Wert
 * zuzuweisen.
 */

public class Exercise {
    public static void main(String[] args) {
        boolean[] array1 = { true, true, true };
        boolean[] array2 = { false, false, true };

        int distance;
        // To call your method here
        distance = getDistance(array1, array2);

        if(distance == -1){
            System.out.println("The arrays do not have the same length!");
        }else{
            System.out.println("The Hamming distance is "+distance);
        }

    }

    // TODO define your method here
    static int getDistance(boolean[] array1, boolean[] array2) {

        if (array1 == null && array2 == null) { // necessary condition always first
            return -1;
        }

        if (array1 == null && array2.length > 0) { // necessary test condition
            return -1;
        }

        if (array2 == null && array1.length > 0) { // necessary test condition
            return -1;
        }

        if (array1.length != array2.length) {
            return -1;
        } else {
            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    count++;
                }
            }
            return count;
        }
    }
}



