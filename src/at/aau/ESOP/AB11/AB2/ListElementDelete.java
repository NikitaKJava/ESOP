package at.aau.ESOP.AB11.AB2;

import java.util.LinkedList;

/**
 * Created by Nikita on 15.06.2021 at 19:59
 */
public class ListElementDelete {
    public static void main(String[] args) {
        /**
         * Implementieren Sie die Methode listElementDelete(LinkedList<Integer> list1, LinkedList<Integer> list2), welche aus list1 alle
         * Elemente entfernt, die in list2 enthalten sind. Verwenden Sie für den Durchlauf der LinkedList eine while-Schleife. Für den Vergleich
         * können Sie die Methode java.util.LinkedList.contains verwenden.
         */

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(9);


        list2.add(1);
        list2.add(2);
        list2.add(9);
        list2.add(5);

        ///
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        LinkedList<Integer> list4 = new LinkedList<Integer>();
        list3.add(1);
        list3.add(2);
        list3.add(2);
        list3.add(3);

        list4.add(2);
        list4.add(5);


        listElementDelete(list1, list2);
        printList(list1);

        listElementDelete(list3, list4);
        printList(list3);
    }

    private static void printList(LinkedList<Integer> list1) {
        for (int str : list1){
            System.out.println(str);
        }
    }

    public static void listElementDelete(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        //TODO: Put your code here.

        int index2 = list2.size() -1;

        while (index2 >= 0){
            int index1 = list1.size()-1;

            while (index1 >= 0) {
                if ((list2.get(index2).equals(list1.get(index1)))) {
                    list1.remove(index1);
                }
                index1--;
            }

            index2--;
        }
    }
}
