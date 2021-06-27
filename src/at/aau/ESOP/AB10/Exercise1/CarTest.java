package at.aau.ESOP.AB10.Exercise1;

/**
 * Created by Nikita on 08.06.2021 at 21:14
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp(10);
        car.changeGear(3);
        car.printState();
    }

    /**
     * Schreiben Sie die Klasse Car, die das Interface Vehicle implementiert. Diese Klasse hat zwei Attribute: private int speed
     * und private int gear. Initialisieren Sie beide Attribute mit 0. Um das Interface Vehicle zu implementieren, müssen
     * Sie alle abstrakten Methoden des Interface implementieren:
     *  - changeGear: aktualisiere den Wert von gear mit dem newValue.
     *  - speedUp: aktualisieren Sie den Wert von speed, indem Sie increment dazu addieren.
     *  - applyBreak: aktualisiert den Wert von speed, indem decrement davon subtrahiert wird.
     * Implementieren Sie außerdem die Methode public void printState() zur Ausgabe von "gear: <gear>, speed: <speed>".
     * Gehen Sie davon aus, dass ein Wert 0 von gear den Leerlauf bedeutet.
     * Hinweis: Methoden eines interface sind standardmäßig abstract und public.
     */

    public interface Vehicle {
        void changeGear(int newValue);
        void speedUp(int increment);
        void applyBreak(int decrement);
    }

    public static class Car implements Vehicle {
        //TODO put your code here
        private int speed = 0;
        private int gear = 0;

        public void changeGear(int newValue) {
            this.gear = newValue;
        }

        public void speedUp(int increment) {
            this.speed += increment;
        }

        public void applyBreak(int decrement) {
            this.speed -= decrement;
        }

        public void printState() {
            System.out.print("gear: " + gear + ", speed: " + speed);
        }
    }
}

