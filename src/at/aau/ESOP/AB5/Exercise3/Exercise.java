package at.aau.ESOP.AB5.Exercise3;

/**
 * Created by Nikita on 27.04.2021 at 22:55
 */
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int input;
        int count = 0;

        //TODO: put your code here
        Scanner scanner = new Scanner(System.in);
        int lastNumber = scanner.nextInt();

        for(int i = 1; i <= lastNumber; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
                count++;
            } else {
                System.out.print("# ");
            }
        }
        System.out.print("\nFound " + count + " prime numbers until " + lastNumber + ".");
    }
    // TODO: put your method definitions here
    static boolean isPrime(int i){
        if(i == 1){
            return false;
        } else {
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    return false;
                }
            }
        }
        return true;
    }
}