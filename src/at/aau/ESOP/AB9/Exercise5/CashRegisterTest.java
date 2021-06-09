package at.aau.ESOP.AB9.Exercise5;

/**
 * Created by Nikita on 02.06.2021 at 13:14
 */
import java.util.Scanner;

public class CashRegisterTest {

    public static void main(String[] args) {
        CashRegisterTest test = new CashRegisterTest();
        test.cashRegisterTest();
    }
    /**
     * Implementieren Sie die Klasse CashRegister, welche eine Geldkassa (in einem Supermarkt) repräsentiert.
     *
     * Die Klasse beinhaltet die Instanzvariable double currentAmount, welche den aktuellen Kassastand speichert. Achten Sie darauf, dass auf currentAmount nur von innerhalb
     * der Klasse, bzw. von Klassen, welche von CashRegister erben, zugegriffen werden kann. Weiters besitzt die Klasse die folgenden Methoden:
     *
     *     CashRegister(double startAmount)
     *        - Konstrukor, der den Eröffnungsgeldbetrag der Kasse bestimmt.
     *        - Ist startAmount ein nicht negativer Wert, so soll zugleich "Die Kassa ist offen!" auf der Konsole ausgegeben werden. Außerdem soll startAmount als aktueller Kassastand (currentAmount) gespeichert werden.
     *        - Sollte startAmount negativ sein, so soll "Fehlerhafter Startwert!" auf der Konsole ausgegeben werden und die Instanzvariable currentAmount den Wert 0 gesetzt werden.
     *     public void printCurrentAmount()
     *        - Gibt den aktuellen Kassastand auf der Konsole aus.
     *        - Sind z.B. 50 Euro in der Kassa, so soll "Die Kassa beinhaltet 50.00 Euro." auf der Konsole ausgegeben werden.
     *     public double payment(double amountToPay, double givenAmount)
     *        - Es wird die Einkaufssumme (amountToPay) mit dem übergebenen Geldbetrag (givenAmount) bezahlt. Diese Methode soll den Kassastand
     *          um die Einkaufssumme aktualisieren und auch das Rückgeld ausgeben.
     *        - Handelt es sich um eine korrekte Transaktion, beispielsweise payment(7.5, 10) so soll "Der Betrag 7.50 Euro wurde mit 10.00 Euro bezahlt.
     *          Wechselgeld = 2.50 Euro." auf der Konsole ausgegeben werden und der Wert des Wechselgeldes (in diesem Fall 2.50) retourniert werden.
     *        - Ist der gegebene Geldbetrag zu gering, beispielsweise payment(10, 7.5) so soll "Fehler! Der gegebene Betrag ist zu gering. (7.50 < 10.00)"
     *        auf der Konsole ausgegeben werden und der zu retournierende Wert ist in diesem Fall -1. Der Geldbetrag in der Kassa darf in diesem Fall
     *        nicht verändert werden.
     *
     * Wichtiger Hinwies: Achten Sie darauf, dass alle Ausgaben auf zwei Dezimalstellen gerundet werden z.B. 5.487 wird zu 5.49 und 2 wird zu 2.00. Benutzen Sie zum Runden auf 2 Dezimalzahlen String.format().
     *
     * Versuchen Sie den Code der Klasse CashRegisterTest zu verstehen. Bei korrekter Implementierung sollte die cashRegisterTest-Methode der Klasse CashRegisterTest fehlerfrei ausgeführt werden können.
     *
     * NB: Normalerweise ist ein Konstruktor stumm (d.h. es gibt keine Konsolen-Ausgabe im Konstruktor). Dies gilt nur für den Zweck dieser Übung.
     */
    class CashRegister{
        protected double currentAmount; // Instanzvariable

        CashRegister(double startAmount) {
            if(startAmount < 0){
                System.out.println("Fehlerhafter Startwert!");
                this.currentAmount = 0;
            } else {
                System.out.println("Die Kassa ist offen!");
                this.currentAmount = startAmount;
            }
        }

        public double getCurrentAmount() {
            return currentAmount;
        }

        public double payment(double amountToPay, double givenAmount) {
            if(amountToPay > givenAmount){
                System.out.println(String.format("Fehler! Der gegebene Betrag ist zu gering. (%.2f < %.2f)", givenAmount, amountToPay));
                return -1;
            }
            if(amountToPay < givenAmount){
                System.out.println(String.format("Der Betrag %.2f Euro wurde mit %.2f Euro bezahlt. Wechselgeld = %.2f Euro.", amountToPay, givenAmount, (givenAmount - amountToPay)));
                this.currentAmount += amountToPay;
            }
            return (givenAmount - amountToPay);
        }

        public void printCurrentAmount() {
            System.out.println(String.format("Die Kassa beinhaltet %.2f Euro.", getCurrentAmount()));
        }
    }


    public void cashRegisterTest() {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        // Start the day
        CashRegister register = new CashRegister(in.nextDouble());

        // Process the payments
        for (int i = 0; i < testCases; i++) {
            register.payment(in.nextDouble(), in.nextDouble());
        }

        register.printCurrentAmount();

        // Close for the day
        register.printCurrentAmount();

    }
}