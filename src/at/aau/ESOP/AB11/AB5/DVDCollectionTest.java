package at.aau.ESOP.AB11.AB5;

import java.util.LinkedList;

/**
 * Created by Nikita on 16.06.2021 at 21:33
 */
public class DVDCollectionTest {
    /**
     * Ihre Aufgabe ist es, eine Verwaltungssoftware zum Organisieren einer DVD-Sammlung zu erstellen.
     * Implementieren Sie die nachfolgend beschriebenen Klassen anhand der gegebenen Spezifikationen.
     *
     * Klasse DVD
     *
     * Definieren Sie Objektvariablen für Titel (Typ String, Name title) und Erscheinungsjahr (Typ int, Name releaseYear).
     * Implementieren Sie einen Konstruktor, der den Titel und das Erscheinungsjahr übergeben bekommt, sowie Getter-Methoden
     * für die zwei Objektvariablen.
     * Implementieren Sie auch eine toString()-Methode, welche eine textuelle Repräsentation der DVD zurückliefert.
     * Die Rückgabe soll folgendermaßen aufgebaut sein:
     *
     * "<title> (<releaseYear>)"
     *
     * Klasse DVDCollection
     *
     * Mit dieser Klasse werden die DVDs verwaltet – sprich es soll möglich sein, neue DVDs anzulegen und nach dem
     * Erscheinungsjahr gefiltert auf der Konsole auszugeben. Die DVD-Objekte sollen dabei in einer LinkedList gespeichert
     * werden. Es sollen folgende Funktionen implementiert werden:
     *
     *     Ein Konstruktor, der keine Parameter übergeben bekommt, und LinkedList initialisiert.
     *     void addDVD(DVD dvd) – Eine neue DVD wird in die Sammlung aufgenommen.
     *     void showDVDList(int year) – Gibt DVD-Objekte auf der Konsole aus. Es sollen jene DVDs ausgegeben werden,
     *     bei denen das Erscheinungsjahr mit year übereinstimmt. Falls year gleich 0 ist, sollen alle vorhandenen DVDs
     *     ausgegeben werden.
     *
     * Hinweis: Implementieren Sie die beiden Klassen in getrennten Dateien und fügen Sie dann beide in das Antwortfeld ein.
     */
    public void main(String[] args) {
        DVDCollection dvdCollection = new DVDCollection();
        DVD dvd1 = new DVD("Der Prinz aus Zamunda", 1988);
        DVD dvd2 = new DVD("Terminator 1", 1984);
        DVD dvd3 = new DVD("Fluch der Karibik 1", 2003);
        DVD dvd4 = new DVD("Fluch der Karibik 2", 2006);
        DVD dvd5 = new DVD("Inception", 2010);

        dvdCollection.addDVD(dvd1);
        dvdCollection.addDVD(dvd2);
        dvdCollection.addDVD(dvd3);
        dvdCollection.addDVD(dvd4);
        dvdCollection.addDVD(dvd5);

        dvdCollection.showDVD(2003);
    }


    class DVDCollection {
        private final LinkedList<DVD> list;

        public DVDCollection() {
            list = new LinkedList<>();
        }

        public void addDVD(DVD dvd) {
            list.add(dvd);
        }

        public void showDVD(int year) {

            if(year == 0){
                System.out.println(list.toString().replace("[", "").replace("]", "").replace(", ",""));
            }

            for (DVD yearRelease : list) {
                if (yearRelease.getYear() == year) {
                    System.out.println(yearRelease.getTitle() + " (" + yearRelease.getYear() + ")");
                }
            }
        }
    }

    class DVD {
        String title;
        int releaseYear;

        public DVD(String title, int releaseYear) {
            this.title = title;
            this.releaseYear = releaseYear;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return releaseYear;
        }

        @Override
        public String toString() {
            return getTitle() + " (" + getYear() + ")\n";
        }
    }
}
