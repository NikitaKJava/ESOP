package at.aau.ESOP.AB2.Exercise5;

/**
 * Created by Nikita on 23.03.2021 at 00:16
 */

import java.util.Scanner;

/**
 * Lesen Sie die id, also die eindeutige Kennung, einer Alterskategorie
 * (als Ganzzahl von 1 bis 4) ein und geben Sie den dazugehörigen Namen der
 * Alterskategorie aus. Verwenden Sie hierfür  if-Bedingungen.
 * So sollte z.B. der Wert 1 zur Ausgabe von "Child" führen.
 * Bei einer Eingabe außerhalb des Bereichs soll der Fehlertext "Input is invalid!"
 * ausgegeben werden.
 * ID 	Category
 * 1 	Child
 * 2 	Teen
 * 3 	Adult
 * 4 	Senior
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String category;
        //TODO: put your code here

        if(id == 1){
            System.out.println("Child");
        }
        if(id == 2){
            System.out.println("Teen");
        }
        if(id == 3){
            System.out.println("Adult");
        }
        if(id == 4){
            System.out.println("Senior");
        }
        if(id > 4 || id < 1) {
            System.out.println("Input is invalid!");
        }
    }
}
