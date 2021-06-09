package at.aau.ESOP.AB9.Exercise8;

/**
 * Created by Nikita on 02.06.2021 at 12:52
 */
import java.util.Scanner;

public class WaterWorkTest {

    public static void main(String[] args) {
        WaterWorkTest test = new WaterWorkTest();

        // Test water tank methods
        // uncomment if needed
//         test.testWaterTank();

        // Test water work method
        // uncomment if needed
         test.testWaterWork();
    }

    /**
     * Klasse WaterTank
     * Erstellen Sie eine Klasse WaterTank und stellen Sie sicher, dass diese Klasse eine Methode
     * double addWater(double liters) anbietet um Wasser aufzufüllen. Der aktuelle Wasserstand soll
     * in der Variable double level gespeichert werden. Überlegen Sie welchen Zugriffsmodifikator
     * (Access specifier) die Variable level und die definierte Methode aufweisen sollten.
     * Ist genügend Kapazität im Tank vorhanden, wird die übergebene Menge zum Tank hinzugefügt und
     * als Rückgabewert wird 0.0 zurückgegeben. Ist nicht genügend Kapazität im Wassertank vorhanden
     * um das ganze Wasser aufzunehmen, so soll so viel Wasser wie möglich in den Tank gefüllt werden
     * und die überschüssige Menge in Litern zurückgegeben werden (der Tank ist danach also voll).
     * Fügen Sie zudem eine Methode double getWaterLevel() hinzu, um den aktuellen Füllstand des Tanks
     * auszulesen. Überlegen Sie welchen Zugriffsmodifikator (Access specifier) die Methode aufweisen sollte.
     */
    public static class WaterTank{
        public static final double MAX_LEVEL = 500.;
        protected double level = 0.0;

        public double addWater(double liters) {
            double tmp = this.level;
            if (this.level + liters >= MAX_LEVEL) {
                this.level = MAX_LEVEL;
                return (tmp + liters) - MAX_LEVEL;
            } else {
                this.level += liters;
                return 0.0;
            }
        }
        public double getWaterLevel(){
            return this.level;
        }
    }

    /**
     * Klasse WaterWork
     *
     * Die Klasse WaterWork implementiert das Wasserwerk und soll im Konstruktor WaterWork(int numOfTanks) die Anzahl der W
     * assertanks übernehmen. Die Wassertanks sollen in einem Array WaterTank[] tanks gespeichert werden. Achten Sie darauf,
     * dass jeder Wassertank als neues Objekt initialisiert wird. Überlegen Sie welchen Zugriffsmodifikator (Access specifier)
     * das Array mit Wassertanks aufweisen sollte.
     * Implementieren Sie darüber hinaus die folgenden Methoden:
     *     Die Methode double getTotalWaterLevel() gibt den gesamten Wasservorrat des Wasserwerkes zurück.
     *     Die Methode double addWater(int tank, double liter) befüllt den Tank mit der Nummer tank mit der in liter gegebenen
     *     Menge an Wasser.
     *        - Sollte eine ungültige Tanknummer übergeben werden, so soll -1 zurückgegeben werden.
     *        - Innerhalb dieser Methode wird der entsprechende Tank mit der übergebenen Wassermenge befüllt. Wiederum soll die
     *        Restmenge, welche nicht mehr in den Tank passt als Rückgabewert zurückgegeben werden.
     *
     * Versuchen Sie den Code der Klasse WaterWorkTest zu verstehen. Bei korrekter Implementierung sollten die waterWorkTest()
     * und waterTankTest()-Methoden der Klasse WaterWorkTest fehlerfrei ausgeführt werden können.
     */
    public static class WaterWork {
        protected WaterTank[] tanks;

        public WaterWork(int numOfTanks) {
            tanks = new WaterTank[numOfTanks];
            for (int i = 0; i < tanks.length; i++) {
                tanks[i] = new WaterTank();
            }
        }

        public double getTotalWaterLevel() {
            double waterLevel = 0.;
            for (WaterTank waterTank : tanks) {
                waterLevel += waterTank.getWaterLevel();
            }
            return waterLevel;
        }

        public double addWater(int tank, double liter) {
            if (tank >= 0 && tank < tanks.length) {
                return tanks[tank].addWater(liter);
            } else {
                return -1;
            }
        }
    }


    private void testWaterWork() {
        Scanner in = new Scanner(System.in);
        int numTestCases = in.nextInt();
        int numWaterTanks = in.nextInt();

        WaterWork waterWork = new WaterWork(numWaterTanks);

        for (int i = 0; i < numTestCases; i++) {
            double result = waterWork.addWater(in.nextInt(), in.nextDouble());
            System.out.println(String.format("Spillover=%.2f; level=%.2f", result, waterWork.getTotalWaterLevel()));
        }
    }

    private void testWaterTank() {
        Scanner in = new Scanner(System.in);
        int numTestCases = in.nextInt();

        WaterTank tank = new WaterTank();

        for (int i = 0; i < numTestCases; i++) {
            double result = tank.addWater(in.nextDouble());
            System.out.println(String.format("Spillover=%.2f; level=%.2f", result, tank.getWaterLevel()));
        }
    }
}
