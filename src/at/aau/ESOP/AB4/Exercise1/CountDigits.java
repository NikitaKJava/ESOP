package at.aau.ESOP.AB4.Exercise1;

/**
 * Created by Nikita on 07.04.2021 at 13:43
 */
import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {

        //TODO Put your code here
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        for(int i = 9; i >= 0; --i){
            long num = number;
            int count = 0;
            int digit = 0;

            while(num > 0){
                digit = (int) (num % 10);
                num /= 10;
                if(digit == i){
                    count++;
                }
            }
            if(count > 0){
                System.out.println(i + " occurs " + count + " time(s)");
            }
        }
    }
}
