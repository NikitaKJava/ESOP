package at.aau.ESOP.AB1.Exercise10;
import java.util.Scanner;

/**
 * Created by Nikita on 10.03.2021 at 21:24
 */
public class Dreieckstausch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        //TODO: Put your code here
        double swap = a;
        a = b;
        b = swap;

        System.out.println(a);
        System.out.println(b);

    }
}
