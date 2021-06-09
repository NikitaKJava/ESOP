package at.aau.ESOP.AB8.Exercise2;

import java.util.Scanner;

/**
 * Created by Nikita on 19.05.2021 at 19:11
 */
public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        Scanner in = new Scanner(System.in);
        int l1 = in.nextInt();
        int w1 = in.nextInt();
        int l2 = in.nextInt();
        int w2 = in.nextInt();
        rectangleTest.executeRectangleTest(l1, w1, l2, w2);
    }

    public void executeRectangleTest(int l1, int w1, int l2, int w2) {
        // Create first rectangle
        Rectangle r1 = new Rectangle();
        r1.setLength(l1);
        r1.setWidth(w1);
        // Create a second rectangle
        Rectangle r2 = new Rectangle(w2, l2);
        // Create a third rectangle
        Rectangle r3 = new Rectangle(w1, l2);
        System.out.printf("[Rectangle] l=%d; w = % d; area =%d, perimeter =%d square =%b %n",
        r1.getLength(), r1.getWidth(),r1.getArea(), r1.getPerimeter(), r1.isSquare());
        System.out.println(String.format("[Rectangle] l=%d; w = % d; area =%d, perimeter =%d square =%b ",
        r2.getLength(), r2.getWidth(), r2.getArea(), r2.getPerimeter(), r2.isSquare()));
        System.out.println(String.format("[Rectangle] l=%d; w = % d; area =%d, perimeter =%d square =%b ", r3.getLength(), r3.getWidth(), r3.getArea(), r3.getPerimeter(), r3.isSquare()));
    }

    public static class Rectangle {
        protected int width;
        protected int length;

        public Rectangle(int width, int length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle() {
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getArea() {
            return (this.width * this.length);
        }

        public int getPerimeter() {
            return (2 * this.width + 2 * this.length);
        }

        public boolean isSquare() {
            if(this.width != this.length){
                return false;
            }
            return true;
        }
    }
}