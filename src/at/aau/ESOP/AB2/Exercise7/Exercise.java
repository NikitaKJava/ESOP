package at.aau.ESOP.AB2.Exercise7;

/**
 * Created by Nikita on 23.03.2021 at 00:19
 */

import java.util.Scanner;

/**
 * Lesen Sie ein Alter (als Ganzzahl von 0 bis 125) ein und geben Sie den dazugehörigen
 * Namen des Alterskategorie aus. Verwenden Sie hierfür die if-Verzweigungen. Die Ausgabe
 * sollte z.B. für die Wert 11 "Child" sein. Bei einer Eingabe außerhalb des Bereichs soll
 * der Fehlertext "Input is invalid!" ausgegeben werden.
 * 0-12 	Child
 * 13-19 	Teen
 * 20-59 	Adult
 * 60-120 	Senior
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        //TODO: put your code here
        if(age >= 0 && age <= 12){
            System.out.println("Child");
        }
        if(age >= 13 && age <= 19){
            System.out.println("Teen");
        }
        if(age >= 20 && age <= 59){
            System.out.println("Adult");
        }
        if(age >= 60 && age <= 120){
            System.out.println("Senior");
        }
        if(age < 0 || age > 120) {
            System.out.println("Input is invalid!");
        }
    }
}
