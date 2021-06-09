package at.aau.ESOP.AB8.Exercise8;

import java.util.Scanner;

/**
 * Created by Nikita on 25.05.2021 at 23:20
 */
public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.circleTest();
    }

    public void circleTest() {
        Scanner in = new Scanner(System.in);
        Circle c1 = new Circle(in.nextInt(), in.nextInt(), in.nextInt());
        Circle c2 = new Circle(in.nextInt(), in.nextInt(), in.nextInt());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(String.format("Area of c1 is %.2f", c1.getArea()));
        System.out.println(String.format("Area of c2 is %.2f", c2.getArea()));
        System.out.println(String.format("Circumference of c1 is %.2f", c1.getCircumference()));
        System.out.println(String.format("Circumference of c2 is %.2f", c2.getCircumference()));


        if (c1.compareArea(c2) < 0) {
            System.out.println("c1 is smaller");
        } else if (c1.compareArea(c2) == 0) {
            System.out.println("Circles are the same size");
        } else {
            System.out.println("c1 is larger");
        }

        System.out.println(c1.equals(c2) ? "c1 equals c2" : "c1 not equals c2");
        System.out.println(c1.equals(Math.PI) ? "c1 equals Math.PI" : "c1 not equals Math.PI");
    }

    /**
     * Represents a circle by storing its center coordinates and its radius.
     */
    class Circle {

        protected int xPos;
        protected int yPos;
        protected int radius;

        /**
         * Create a new circle with given center coordinates and given radius
         *
         * @param xPox   X-coordinate of the center
         * @param yPos   Y-coordinate of the center
         * @param radius Radius of the circle
         */
        public Circle(int xPox, int yPos, int radius) {
            this.xPos = xPox;
            this.yPos = yPos;
            this.radius = radius;
        }

        /**
         * Calculates the area of the circle.
         * <p>
         * Formula: PI * (r*r)
         *
         * @return The circles area
         */
        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        // TODO Define your methods here

        // ---------- BEGIN GETTER AND SETTERS ----------

        public int getxPos() {
            return xPos;
        }

        public void setxPos(int xPos) {
            this.xPos = xPos;
        }

        public int getyPos() {
            return yPos;
        }

        public void setyPos(int yPos) {
            this.yPos = yPos;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public String toString(){
            return String.format("[circle] center=%d,%d; radius=%d", xPos, yPos, radius);
        }

        public boolean equals(Object o){
            if(this == o){
                return true;
            }

            if(!(o instanceof Circle)){
                return false;
            }

            Circle circle = (Circle) o;
            return getxPos() == circle.getxPos() && // boolean
                    getyPos() == circle.getyPos() && // boolean
                    getRadius() == circle.getRadius(); // boolean
        }

        public int compareArea(Circle circle){
            return this.getRadius() - circle.getRadius();
        }
    }
}
