package at.aau.ESOP.AB11.AB1;

import java.util.ArrayList;

/**
 * Created by Nikita on 15.06.2021 at 19:22
 */
public class ArrayListTest {
    public static void main(String[] args) {

        /**
         * Implementieren Sie die Methode public static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2),
         * welche zwei ArrayList-Parameter vom Typ String in der übergebenen Reihenfolge vereinigt. Es sollen keine doppelten Elemente
         * in der resultierenden Liste vorhanden sein, wobei jeder String pro Eingabeliste nur einmal vorkommt. Geben Sie die neu erzeugte Liste zurück.
         */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Das");
        list1.add("ist");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ist");
        list2.add("ein Test");

        ArrayList<String> myNewList = union(list1, list2);
        ArrayList<String> list3 = union(list1, list2);
        ArrayList<String> list4 = union(list3, list2);
        ArrayList<String> list5 = union(list4, list3);

        for (String str: list5) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> union(ArrayList<String> list1, ArrayList<String> list2) {
        //TODO: Put your code here.

        ArrayList<String> result = new ArrayList<>();

        result.addAll(list1);
        result.addAll(list2);

        int size = result.size();
        for(int i = 0; i < size; i++){
            for (int j = i + 1; j < size; j++) {
                if(j != result.size()) {
                    if (result.get(i).equals(result.get(j))) {
                        result.remove(j);
                        size--;
                    }
                }
            }
        }

        return result;
    }
}
