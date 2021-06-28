package at.aau.ESOP.AB11.AB3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Nikita on 15.06.2021 at 23:59
 */
public class printArrayListWithDifferentDatatypes {
    public static void main(String[] args) {

        /**
         * Implementieren Sie eine Methode static void printList(LinkedList<Object> list), welches jedes Objekt der
         * übergebenen LinkedList das vom Typ String, Integer oder int[] ist, auf der Konsole zeilenweise ausgibt.
         * Bei anderen Datentypen geben Sie "Other data type: " gefolgt von dem gefunden Datentyp an Stelle des Objektes aus.
         * Hinweis 1: Recherchieren Sie außerdem, wofür instanceof verwendet werden kann.
         *
         * Hinweis 2: Die Methode .getClass() hilft Ihnen, den Datentyp eines Objektes ausfindig zu machen.
         */
        test1();
        test2();
    }

    static void printList(LinkedList<Object> list) {
        //TODO: Put your code here.
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer || list.get(i) instanceof String || list.get(i).getClass().isArray()){
                if (list.get(i).getClass().isArray()){
                    System.out.println(Arrays.toString((int[]) list.get(i)));
                } else {
                    System.out.println(list.get(i));
                }
            } else {
                System.out.println("Other data type: " + list.get(i).getClass());
            }
        }
    }

    public static void test1() {
        LinkedList<Object> myList = new LinkedList<Object>();
        myList.add("Test");
        myList.add("Nr.");
        myList.add(1);
        myList.add("for");
        int arr1[] = {1, 2, 3};
        myList.add(arr1);
        printList(myList);
    }

    public static void test2() {
        int arr1[] = {1, 2, 3};
        Integer i = 1;
        Boolean b = false;

        LinkedList<Object> myList = new LinkedList<Object>();
        myList.add("Hallo");
        myList.add(arr1);
        myList.add(b);
        myList.add(i);
        printList(myList);
    }
}
