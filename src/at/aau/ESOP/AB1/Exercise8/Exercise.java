package at.aau.ESOP.AB1.Exercise8;
import java.util.Scanner;

/**
 * Created by Nikita on 10.03.2021 at 21:24
 */
public class Exercise{
    public static void main(String[] args) {
        int number;
        int result;
        int sum;

        //TODO: put your code here
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        result = (int)(number + Math.PI);
        sum = (int)(number + Math.E);

        System.out.println(result);
        System.out.println(sum);
    }
}
