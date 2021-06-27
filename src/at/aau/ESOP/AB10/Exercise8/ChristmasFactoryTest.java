package at.aau.ESOP.AB10.Exercise8;

import java.util.Scanner;

/**
 * Created by Nikita on 09.06.2021 at 11:13
 */
public class ChristmasFactoryTest {
    /**
     * Thrown to indicate that a christmas-method has
     * been passed an inappropriate argument.
     */
    public static class ChristmasFactory {

        /**
         * Application's entry point
         */
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            int height = 1;
            char character = '+';
            StringBuilder tree = null;
            //TODO Put your code here
            try {
                System.out.println(Christmas.buildChristmasTree(height, character));
            } catch (ChristmasException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Implementieren Sie ein Program ChristmasFactory, das Weihnachtsbäume in Form von Zeichenketten herstellt.
     * Implementieren Sie dazu die Methode StringBuilder buildChristmasTree(int height, char ch) der Klasse Christmas,
     * welche einen ganze Zahl height und Zeichen ch als Argument übernimmt. Die Methode erstellt eine Zeichenkette,
     * die eine vereinfachte Version eines Weihnachtsbaumes darstellt und gibt den erstellten String mit einem StringBuilder
     * wieder zurück. Die Methode soll die zur Verfügung gestellte ChristmasException werfen, wenn die übergebenen Parameter
     * nicht den Erwartungen entsprechen. Stellen Sie daher sicher, dass
     * <p>
     * - die Höhe des Baumes mindestens 3 ist, sonst werfen Sie die Exception mit der Nachricht "Santa has bigger expectations
     * for his tree".
     * - das übergebene Zeichen ein Stern '*' oder '#' ist, sonst werfen Sie die Exception mit der Nachricht "Rudolf wouldn't
     * like this character".
     * <p>
     * In Fall, dass beide Bedingungen nicht erfüllt sind geben Sie beide Fehlernachrichten wie folgt aus: "Santa has bigger
     * expectations for his tree and Rudolf wouldn't like this character".
     * Implementieren Sie auch die main Methode, wo Sie die Methode buildChristmasTree aufrufen, die Rückgabe in der Variable
     * tree speichern und die ChristmasException abfangen. Im Fall, dass eine Exception ausgelöst wird, schreiben Sie die
     * mitgelieferte Fehlernachricht auf die Konsole. Stellen Sie jedoch sicher, dass die zur Verfügung gestellte Methode String
     * addGreetings(StringBuilder tree) mit der vorgegebenen Variable tree aufgerufen wird und der Rückgabewert auf die Konsole
     * geschrieben wird.
     */

    static class ChristmasException extends Exception {

        /**
         * Constructs an ChristmasException with the
         * specified detail message.
         *
         * @param message the detail message
         */
        public ChristmasException(String message) {
            super(message);
        }
    }

    static class Christmas {

        /**
         * Prints a christmas tree to stdout.
         *
         * @param height the height of the tree
         * @param ch     the character to decorate the tree
         * @return StringBuilder representing the tree
         * @throws ChristmasException if height is smaller than 3 or
         *                            the character is not a star
         */
        public static StringBuilder buildChristmasTree(int height, char ch) throws ChristmasException
        //TODO Declare any thrown Exceptions here
        {
            StringBuilder tree = new StringBuilder();

            //TODO Put your code here
            boolean isSign = ch == '*' || ch == '#';

            if (height < 3 && !isSign) {
                throw new ChristmasException("Santa has bigger expectations for his tree and Rudolf wouldn't like this character\n" + addGreetings(tree));
            }

            if (height < 3) {
                throw new ChristmasException("Santa has bigger expectations for his tree\n" + addGreetings(tree));
            }

            if (!isSign) {
                throw new ChristmasException("Rudolf wouldn't like this character\n" + addGreetings(tree));
            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < height - i - 1; j++) {
                        tree.append(" ");
                    }
                    for (int k = 0; k < (2 * i + 1); k++) {
                        tree.append(ch);
                    }
                    tree.append("\n");
                }

                addGreetings(tree);
            }


            return tree;
        }

        /**
         * Concatenates an one line message to a given string.
         *
         * @param tree the string representing the christmas tree
         * @return the concatenated string with an one line message
         */
        public static String addGreetings(StringBuilder tree) {

            StringBuilder decoratedTree = tree;
            String message = "We wish you a Merry Christmas!";

            try {
                tree.append(message);
            } catch (NullPointerException e) {
                decoratedTree = new StringBuilder(message);
            }

            return decoratedTree.toString();
        }
    }
}