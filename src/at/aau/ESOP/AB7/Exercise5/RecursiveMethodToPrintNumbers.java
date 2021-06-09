package at.aau.ESOP.AB7.Exercise5;

/**
 * Created by Nikita on 10.05.2021 at 18:40
 */
public class RecursiveMethodToPrintNumbers {
    public static void main(String[] args) {

        recursiveMethod(5);

    }
    public static void recursiveMethod(int n) {

        if(n < 0){
            System.out.print("*");
        }

        if(n >= 0) {
            System.out.print(n);
            recursiveMethod(n - 2);
        }
    }
}
