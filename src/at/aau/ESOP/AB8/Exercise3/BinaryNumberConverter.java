package at.aau.ESOP.AB8.Exercise3;

/**
 * Created by Nikita on 19.05.2021 at 19:27
 */
public class BinaryNumberConverter {
    public static void main(String[] args) {

        System.out.println("Iterative methode");
        System.out.println(toBinaryIterative(10));
        System.out.println("Recursive methode");
        System.out.println(toBinaryRecursive(1));

    }

    public static String toBinaryIterative(int n) {
        if (n < 0) {
            return "n negativ" + "\n";
        }

        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (n != 0) {
            if (n % 2 == 0) {
                binary.append(0);
            }

            if (n % 2 == 1) {
                binary.append(1);
            }
            n /= 2;
        }

        return binary.reverse().toString();
    }

    public static String toBinaryRecursive(int n) {

        if (n < 0) {
            return "n negative";
        }

        if(n == 0){
            return "0";
        }

        if(n == 1){
            return "1";
        }

        return toBinaryRecursive(n / 2) + Integer.toBinaryString(n % 2);
    }
}
