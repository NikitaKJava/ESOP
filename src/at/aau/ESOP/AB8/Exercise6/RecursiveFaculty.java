package at.aau.ESOP.AB8.Exercise6;

/**
 * Created by Nikita on 25.05.2021 at 23:21
 */
import java.util.Scanner;

public class RecursiveFaculty {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.print(calcRecursiveFaculty(number));
    }

    //TODO Put your method here
    static long calcRecursiveFaculty(int n){
        if(n < 0){
            return -1L;
        }

        if(n == 0){
            return 1L;
        }

        return calcRecursiveFaculty(n - 1) *n;
    }
}
