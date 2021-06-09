package at.aau.ESOP.AB4.Exercise6;

/**
 * Created by Nikita on 07.04.2021 at 13:48
 */

/**
 * Gegeben sei das int-Array numbers, schreiben Sie ein Programm, das den Durchschnitt der Zahlen im Array ausgibt. Der Durchschnitt soll vom Typ double sein.
 * Wenn das Eingabe-Array leer ist, dann soll n/a gedruckt werden.
 */
public class Exercise {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        // TODO Put your code here
        double sum = 0;

        if(numbers.length <= 0) {
            System.out.print("n/a");
        } else {

            for(int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }

            System.out.println(sum / numbers.length);
        }
    }
}