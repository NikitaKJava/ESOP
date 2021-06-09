package at.aau.ESOP.AB8.Exercise7;

/**
 * Created by Nikita on 25.05.2021 at 22:36
 */

import java.util.Scanner;

/**
 * A point with an x- and y-coordinate
 */
public class PointsAndLines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Points 0...1
        Point point0 = new Point(in.nextInt(), in.nextInt());
        Point point1 = new Point(in.nextInt(), in.nextInt());
        // Line #1
        Line line1 = new Line();
        line1.setStart(point0);
        line1.setEnd(point1);
        // Points 2..3
        Point point2 = new Point(in.nextInt(), in.nextInt());
        Point point3 = new Point(in.nextInt(), in.nextInt());
        // Line #2
        Line line2 = new Line();
        line2.setStart(point2);
        line2.setEnd(point3);
        // Print lengths of lines
        System.out.printf("l=%.3f%n", line1.getLength());
        System.out.printf("l=%.3f%n", line2.getLength());
        // Check if common start or end point
        if (line1.haveCommonStartOrEnd(line2)) {
            System.out.println("Lines start or end on the same point.");
        } else {
            System.out.println("Lines do not share a common start or end.");
        }
    }

    public static class Point {

        protected int x;
        protected int y;

        /**
         * Create a point at the given coordinates
         *
         * @param x X-coordinate
         * @param y Y-coordinate
         */
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        // ---------- BEGIN GETTER AND SETTERS ----------

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    /**
     * Represents a line, which consists of two points
     */
    static class Line {

        protected Point start;
        protected Point end;

        /**
         * Creates a line with no start and end point
         */
        public Line() {
        }

        /**
         * Creates a line with the given start and end point
         *
         * @param start Start of the line
         * @param end   End of the line
         */
        public Line(Point start, Point end) {
            this.start = start;
            this.end = end;
        }

        /**
         * Checks if the start and end point of the line are initialized
         *
         * @return True if start and end points are valid
         */
        public boolean isInitialized() {
            if (start == null || end == null) {
                return false;
            }
            return true;
        }

        /**
         * Calculates the length of the line
         *
         * @return Length between start and end
         */
        public double getLength() {
            if (!isInitialized()) {
                return -1;
            }

            return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2));
        }

        /**
         * Check if two lines share a common start or end point
         *
         * @param other The other line to compare with
         * @return True when start or end are the same
         */
        public boolean haveCommonStartOrEnd(Line other) {
            if (!this.isInitialized() || !other.isInitialized()) {
                return false;
            } else {

                return this.start.equals(other.start) || this.start.equals(other.end)
                        || this.end.equals(other.start) || this.end.equals(other.end);
            }
        }

        // ---------- BEGIN GETTER AND SETTERS ----------

        public Point getStart() {
            return start;
        }

        public void setStart(Point start) {
            this.start = start;
        }

        public Point getEnd() {
            return end;
        }

        public void setEnd(Point end) {
            this.end = end;
        }
    }
}