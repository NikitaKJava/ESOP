package at.aau.ESOP.AB1.Exercise6;
import java.util.Scanner;

/**
 * Created by Nikita on 10.03.2021 at 21:24
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nbBar = in.nextInt();
        int nbPeople = in.nextInt();

        //TODO: Put your code here
        int nbBarsPerPerson = nbBar / nbPeople;
        int nbBarsLeft = nbBar % nbPeople;
        System.out.println("Wir haben " + nbBar + " Schokoladentafeln und " + nbPeople + " Personen, somit bekommt jeder " + nbBarsPerPerson + " Tafeln Schokolade und " + nbBarsLeft + " Tafeln bleiben uebrig.");
    }
}
