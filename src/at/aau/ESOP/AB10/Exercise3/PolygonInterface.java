package at.aau.ESOP.AB10.Exercise3;

/**
 * Created by Nikita on 08.06.2021 at 21:36
 */
public class PolygonInterface {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle();
//        System.out.println(rect.getName() + " has " + rect.getNumOfSides() + " sides.");

//        Rectangle rect = new Rectangle();
//        rect.setSides(new int[]{10, 20});
//        System.out.println(rect.getName() + " has " + rect.getNumOfSides() + " sides.");
//        System.out.println("Perimeter = " + rect.getPerimeter());

        Rectangle rect = new Rectangle();
        rect.setSides(new int[]{4, 2, 4, 2});
        System.out.println("Area = " + rect.getArea());

    }

    /**
     * Sie erhalten die Schnittstelle Polygon, die 5 Methoden enthält:
     * <p>
     * void setSides(int[] sides): setzt die Seiten des Polygons. Beachten Sie, dass die Eingabeseiten in keiner
     * bestimmten Reihenfolge stehen (sind in zufälliger Reihenfolge).
     * String getName(): gibt den Namen des Polygons aus.
     * int getNumOfSides(): gibt die Anzahl der Seiten aus, die das Polygon haben soll.
     * int getArea(): berechnet den Flächeninhalt des Polygons und gibt ihn aus.
     * int getPerimeter(): berechnet den Umfang des Polygons und gibt ihn aus.
     * <p>
     * Ein Rechteck ist ein Polygon, also schreiben Sie eine öffentliche Klasse Rectangle, die das Polygon-Interface und
     * alle seine Methoden implementiert. Sie hat den Namen "Rectangle" und Sie wissen bereits, dass es 4 Seiten hat und
     * wie man die Fläche und den Umfang berechnet.
     * <p>
     * Tipp: Da die Schnittstelle nur die Methoden enthält, überlegen Sie sich, welche Variablen Sie in der Implementierung
     * benötigen.
     * <p>
     * Hinweis: Falls sides (Eingang für die Methode setSides) nicht korrekt angegeben werden (null, leer oder nicht 4 Seiten),
     * werden der Flächeninhalt und der Umfang jeweils 0 sein. Nehmen Sie an, wenn 4 Seiten angegeben sind, haben sie korrekte
     * Werte für ein Rechteck.
     */

    public interface Polygon {
        void setSides(int[] sides);

        String getName();

        int getNumOfSides();

        int getArea();

        int getPerimeter();
    }

    public static class Rectangle implements Polygon {
        private int[] numOfSides = new int[4];


        @Override
        public void setSides(int[] sides) {

            if(sides == null || sides.length < 0 || numOfSides.length > sides.length){
                numOfSides = new int[]{0, 0, 0, 0};
            }

            if (numOfSides.length == sides.length) {
                for (int i = 0; i < sides.length; i++) {
                    numOfSides[i] = sides[i];
                }
            }
        }

        @Override
        public String getName() {
            String name = "Rectangle";
            return name;
        }

        @Override
        public int getNumOfSides() {
            return this.numOfSides.length;
        }

        @Override
        public int getArea() {
            int min = numOfSides[0];
            int max = numOfSides[1];

            for (int i = 0; i < numOfSides.length; i++) {
                if(min < numOfSides[i]){
                    min = numOfSides[i];
                }

                if(max > numOfSides[i]){
                    max = numOfSides[i];
                }
            }
            return  max * min;
        }

        @Override
        public int getPerimeter() {
            int perimeter = 0;

            for (int i = 0; i < numOfSides.length; i++) {
                perimeter += numOfSides[i];
            }
            return perimeter;
        }
    }
}