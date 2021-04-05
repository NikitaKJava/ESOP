package at.aau.ESOP.AB1.Exercise12;
import java.util.Scanner;

/**
 * Created by Nikita on 10.03.2021 at 21:24
 */
public class Exercise {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean isCold;
        boolean isHot;
        boolean isDry;
        boolean isColdAndDry;
        boolean isHotOrDry;
        int number1;
        int number2;
        boolean isGreater = false;
        boolean isEqual = false;

        isCold = scanner.nextBoolean(); //Is it cold? [true/false]
        isDry = scanner.nextBoolean(); //Is it dry? [true/false]
        number1 = scanner.nextInt(); //Enter first integer
        number2 = scanner.nextInt(); //Enter second integer

        //TODO: put your code here
        isHot = !isCold;
        isColdAndDry = isCold && isDry;
        isHotOrDry = !isCold || isDry;
        if(number1 > number2){
            isGreater = true;
        }
        if(number1 == number2){
            isEqual = true;
        }

        System.out.println("Is it hot? " + isHot);
        System.out.println("Is it cold and dry? " + isColdAndDry);
        System.out.println("Is it hot or dry? " + isHotOrDry);
        System.out.println("Is the first number greater than second number? " + isGreater);
        System.out.println("Are the numbers equal? " + isEqual);
    }
}

