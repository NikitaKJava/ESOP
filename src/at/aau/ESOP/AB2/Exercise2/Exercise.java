package at.aau.ESOP.AB2.Exercise2;

/**
 * Created by Nikita on 17.03.2021 at 19:22
 */

import java.util.Scanner;

/** Gegeben ist ein Programm, das die Werte für die boolean-Variablen isCold und isDry einliest. Erweitern Sie das Programm um folgende Ausgaben mit Hilfe von aufeinanderfolgenden if-Anweisungen:
 "It is hot"
 "It is dry"
 "It is hot or dry"
 "It is hot and dry"
 Hinweis: Folgen Sie den Beispielen, um die erwarteten Ausgaben auszugeben.
 */

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isCold = input.nextBoolean(); //Is it cold? [true/false]
        boolean isDry = input.nextBoolean(); //Is it dry? [true/false]

        //TODO: Put your code here
        if(isCold == true && isDry == false){
            System.out.println("");
        }

        if(isCold == true && isDry == true){
            System.out.println("It is dry");
            System.out.println("It is hot or dry");
        }

        if(isCold == false && isDry == false){
            System.out.println("It is hot");
            System.out.println("It is hot or dry");
        }

        if(isCold == false && isDry == true){
            System.out.println("It is hot");
            System.out.println("It is dry");
            System.out.println("It is hot or dry");
            System.out.println("It is hot and dry");
        }
    }
}
