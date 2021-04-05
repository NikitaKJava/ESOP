package at.aau.ESOP.AB2.Exercise10;

/**
 * Created by Nikita on 23.03.2021 at 22:20
 */

import java.util.Scanner;

/**
 * Implementieren Sie einen Geldautomaten. Geben Sie einen Geldbetrag ein und teilen Sie diesen Betrag in eine möglichst geringe Anzahl an Scheinen (100, 50, 20, 10, 5) auf (d.h. Scheine mit einem hohen Geldbetrag werden bevorzugt). Geben Sie entsprechende Meldungen aus. Zum Beispiel:
 * Input 	Output
 * 245
 *
 * 100 Euro: 2
 * 20 Euro: 2
 * 5 Euro: 1
 *
 * Da es keine Münzen gibt, müssen Sie auch überprüfen, ob der eingegebene Betrag überhaupt verarbeitet werden kann. Sollte dies nicht der Fall sein, geben Sie eine Fehlermeldung aus: "Cannot be processed!"
 *
 * Tipp: Verwenden Sie die Operatoren / und %.
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt(); // 260 € amount

        //TODO: put your code here
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;

        if(money % 5 != 0){ // my smallest banknote
            System.out.println("Cannot be processed!");
        } else {
            hundred = money / 100; // 260 / 100 --> 2
            fifty = (money % 100) / 50; // 260 % 100 -- > 60 / 50 -- > 1
            twenty = (money % 100 % 50) / 20; //
            ten = (money % 100 % 50 % 20) / 10;
            five = (money % 100 % 50 % 20 % 10) / 5;
            if(hundred > 0) {
                System.out.println("100 Euro: " + hundred);
            }
            if(fifty > 0) {
                System.out.println("50 Euro: " + fifty);
            }
            if(twenty > 0) {
                System.out.println("20 Euro: " + twenty);
            }
            if(ten > 0) {
                System.out.println("10 Euro: " + ten);
            }
            if(five > 0) {
                System.out.println("5 Euro: " + five);
            }
        }
    }
}
