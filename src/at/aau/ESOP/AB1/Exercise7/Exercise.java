package at.aau.ESOP.AB1.Exercise7;
import java.util.Scanner;

/**
 * Created by Nikita on 10.03.2021 at 21:24
 */
public class Exercise{
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        float salary;
        //Put your code here
        Scanner scanner = new Scanner(System.in);

        firstName = scanner.next();
        lastName = scanner.next();
        age = scanner.nextInt();
        salary = scanner.nextFloat();

        scanner.close();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(salary);
    }
}
