package at.aau.ESOP.AB1.Exercise11;
import java.util.Scanner;

/**
 * Created by Nikita on 10.03.2021 at 21:24
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sec = in.nextInt();

        //TODO: Put your code here
        int hours = sec / 3600;
        int min = (sec % 3600) / 60;
        int sek = (sec % 3600) % 60;

        System.out.println(sec + " Sekunden entspricht " + hours + " Std. " + min + " Min. " + sek + " Sek.");
    }
}
