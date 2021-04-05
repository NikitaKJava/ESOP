package at.aau.ESOP.AB1.Exercise9;
import java.util.Scanner;

/**
 * Created by Nikita on 10.03.2021 at 21:24
 */
public class Exercise {
    public static void main(String[] args){

        int x, y;
        double z;
        double multiply;
        int subtract;
        double power;
        int quotientWithRemainder;
        int remainder;
        double quotient;

        //TODO: put your code here
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextDouble();
        multiply = x * z; //a
        subtract = 3*y - x; // b
        power = Math.pow(y,4); // c
        quotientWithRemainder = x / y;
        remainder = x % y;
        quotient = (double)(x) / y;

        System.out.println(multiply);
        System.out.println(subtract);
        System.out.println(quotient);
        System.out.println(quotientWithRemainder);
        System.out.println(remainder);
        System.out.println(power);

    }
}

