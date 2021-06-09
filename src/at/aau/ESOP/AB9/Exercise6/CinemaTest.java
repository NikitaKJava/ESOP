package at.aau.ESOP.AB9.Exercise6;

/**
 * Created by Nikita on 02.06.2021 at 13:14
 */
import java.util.Scanner;

class CinemaTest {

    public static void main(String[] args) {
        CinemaTest test = new CinemaTest();

        // Test cinema methods
        // uncomment if needed
        test.testCinema();

        // Test cinema hall methods
        // uncomment if needed
//        test.testCinemaHall();
    }

    /**
     *Ihre Aufgabe ist es eine Verwaltungssoftware für ein Kino (Engl. cinema) zu implementieren, welches mehrere Kinosäle
     * (Engl. cinema halls) mit je 200 Plätzen besitzt. Ihre Software soll in der Lage sein jederzeit die aktuelle Belegung
     * des Kinos auszugeben. Implementieren Sie die nachfolgend beschriebenen Klassen und Methoden anhand der gegebenen
     * Spezifikation.
     *
     * Klasse CinemaHall
     * Erstellen Sie die Klasse CinemaHall (Kinosaal). Diese Klasse enthält Instanzvariablen für die Kapazität (capacity)
     * sowie für die Anzahl der aktuellen BesucherInnen des Kinosaals (visitorCounter). Die Instanzvariablen werden im
     * Konstruktor initialisiert. Jeder Kinosaal hat 200 Plätze und die Anzahl der BesucherInnen ist anfangs auf 0 gesetzt.
     * Stellen Sie sicher, dass nur die Klasse CinemaHall direkt auf die Variablen zugreifen darf (Sichtbarkeit!).
     * Stellen Sie sicher, dass die Klasse eine Methode anbietet, um BesucherInnen aufzunehmen:
     * public int addVisitors(int amount)
     * Wenn genügend Kapazität im Kinosaal vorhanden ist, nehmen die Besucher ihre Plätze im Kinosaal ein,
     * "Capacity left <leftCapacity>" wird ausgegeben und als Rückgabewert wird 0 zurückgegeben.
     *
     * Wenn die Kapazität im Kinosaal nicht ausreicht, um alle Besucher unterzubringen, wird die Anzahl der
     * Besucher zurückgegeben,die keinen Sitzplatz erhalten haben (der Kinosaal wäre dann voll besetzt).
     *
     * Fügen Sie zudem eine Methode hinzu, um die aktuelle Belegung des Kinosaals auszulesen:
     * public int getVisitors()
     *
     * Klasse Cinema
     * Die Klasse Cinema implementiert das Kino. Ein Kino hat mehrere Kinosäle. Die Anzahl der Kinosäle wird dem
     * Cinema - Konstruktor übergeben und auch im Konstruktor werden entsprechend viele Kinosäle (CinemaHall) angelegt.
     * Verwalten Sie die Kinosäle in einem Array. Darüber hinaus soll die Klasse Cinema eine Methode anbieten, die die
     * gesamte Belegung des Kinos zurückgibt:
     * public int getSumVisitors()
     * Das Kino hat auch eine Methode um BesucherInnen hinzuzufügen, jedoch muss dabei der entsprechende Kinosaal
     * [0, (Anzahl der Kinosäle-1)] angegeben werden. Sollte eine ungültige Kinosaalnummer übergeben worden sein,
     * so soll eine Fehlermeldung ("ERROR: Invalid cinema hall ID.") ausgeschrieben und der Wert -1 zurückgegeben werden:
     * public int addVisitors(int hall, int amount)
     * Innerhalb dieser Methode wird der entsprechende Kinosaal mit der übergebenen Anzahl an BesucherInnen aufgefüllt.
     * Wiederrum, die Restmenge die nicht mehr in den Kinosaal passt, soll als Rückgabewert ausgegeben werden.
     * Lesen Sie sich den Code der Klasse CinemaTest durch und implementieren Sie die Klassen CinemaHall und Cinema.
     * Bei korrekter Implementierung sollten die testCinemaHall() und testCinema()-Methoden der Klasse CinemaTest
     * fehlerfrei ausgeführt werden können.
     * Tipp: Achten Sie auch die möglichst restriktive Sichtbarkeit der Variablen.
     */
    static class CinemaHall{
        private int capacity = 200;
        private int visitorCounter = 0;


        public int getCapacity() {
            return capacity;
        }

        public int getVisitors() {
            return this.visitorCounter;
        }

        public int addVisitors(int amount){
            if(capacity >= (visitorCounter + amount)) {
                System.out.println("Capacity left " + (capacity - (visitorCounter + amount)));
                visitorCounter += amount;
                return 0;
            }
            if(capacity < (visitorCounter + amount)){
                int temp = visitorCounter;
                this.visitorCounter = capacity;
                return ((temp + amount) - capacity);
            }
            return visitorCounter;
        }
    }

    static class Cinema{
        private CinemaHall[] cinemaHalls;

        public Cinema(int numCinemaHalls) {
            cinemaHalls = new CinemaHall[numCinemaHalls];
            for (int i = 0; i < cinemaHalls.length; i++) {
                cinemaHalls[i] = new CinemaHall();          // creating for each position
            }
        }

        public int addVisitors(int hall, int amout){
            if(hall < 0 || hall >= cinemaHalls.length){
                System.out.println("ERROR: Invalid cinema hall ID.");
                return -1;
            }
            int maxCapacity = 0;
            for (int i = 0; i < cinemaHalls.length; i++) {
                maxCapacity += cinemaHalls[i].getCapacity();
            }
//            System.out.println((getSumVisitors() + amout));
//            System.out.println(maxCapacity);
//            System.out.println((getSumVisitors() + amout) - maxCapacity);

            int temp = getSumVisitors() + amout;
            if(temp > maxCapacity){
                cinemaHalls[hall].addVisitors(amout);
                return (temp - maxCapacity);
            } else {
                cinemaHalls[hall].addVisitors(amout);
                return 0;
            }
        }

        public int getSumVisitors(){
            int sum = 0;
            for (CinemaHall cinemaHall : cinemaHalls) {
                sum += cinemaHall.getVisitors();
            }
            return sum;
        }
    }
    private void testCinema() {
        Scanner in = new Scanner(System.in);
        int numTestCases = in.nextInt();
        int numCinemaHalls = in.nextInt();

        Cinema cinema = new Cinema(numCinemaHalls);

        for (int i = 0; i < numTestCases; i++) {
            int result = cinema.addVisitors(in.nextInt(), in.nextInt());
            System.out.println(String.format("Visitors=%d; Rejected=%d", cinema.getSumVisitors(), result));
        }
    }

    private void testCinemaHall() {
        Scanner in = new Scanner(System.in);
        int numTestCases = in.nextInt();

        CinemaHall cinemaHall = new CinemaHall();

        for (int i = 0; i < numTestCases; i++) {
            int result = cinemaHall.addVisitors(in.nextInt());
            System.out.println(String.format("Visitors=%d; Rejected=%d", cinemaHall.getVisitors(), result));
        }
    }
}

