package at.aau.ESOP.AB8.Exercise4;

/**
 * Created by Nikita on 25.05.2021 at 23:22
 */
public class PointTest {
    public static void main(String[] args) {
        System.out.print("test #1:\n");
        System.out.println(Point.count);
        Point pointA = new Point('x', 1, 1);
        System.out.println(Point.count);
        System.out.println("-------");
        System.out.print("test #2:\n");
        Point pointB = new Point('a', 0, 0);
        Point pointA_bis = new Point('a', 1, 1);
        System.out.println(pointA.equals(pointA_bis));
        System.out.println("-------");

        System.out.print("test #3:\n");
        Point pointC = new Point('a', 0, 0);
        Point pointD = new Point('b', 2, 1);
        pointC.translation(pointD.getX(), pointD.getY());
        System.out.println(pointC.getX());
        System.out.println(pointC.getY());
        System.out.println(pointC.getId());
        System.out.println("-------");

    }

    static class Point {
        //TODO: Put your code here
        private char id;
        private double x;
        private double y;
        public static int count = 0;

        public Point(char id, double x, double y) {
            this.id = id;
            this.x = x;
            this.y = y;
            count++;
        }

        public void translation(double dx, double dy) {
            this.x = dx;
            this.y = dy;
        }

        //getters
        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public char getId() {
            return this.id;
        }

        @Override
        public String toString() {
            return "I am point " + getId() + " at position (" + getX() + "," + getY() + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof Point)) {
                return false;
            }

            Point point = (Point) o;

            // The compare() method in Java compares two class specific objects (x, y) given as parameters. It returns the value:
            //  0: if (x==y)
            // -1: if (x < y)
            //  1: if (x > y)

            return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
        }
    }
}
