package at.aau.ESOP.AB11.AB6;

import java.util.Arrays;

/**
 * Created by Nikita on 16.06.2021 at 21:34
 */
public class SortedArrayListTest {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    static class SortedArrayList {

        private int[] list = new int[0];

        //implement wisely ;)
        public void addAll(int[] newValues) {
            //TODO
            int[] temp = new int[newValues.length];
            for (int i = 0; i < newValues.length; i++) {
                temp[i] = newValues[i];
            }

            // bubble sort O(n²)
            for (int i = 0; i < temp.length - 1; i++) {
                for (int j = 0; j < temp.length - i - 1; j++) {
                    if (temp[j] > temp[j + 1]) {
                        int temp1 = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = temp1;
                    }
                }
            }

            list = new int[newValues.length];
            list = temp;
        }

        //adds an item at the correct place (you may use submethods)
        public void add(int item) {
            //TODO
            //creating new array and fill it from old one with values
            int[] temp = new int[list.length + 1];

            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }
            // last item in the array
            temp[temp.length - 1] = item;

            // bubble sort O(n²)
            for (int i = 0; i < temp.length - 1; i++) {
                for (int j = 0; j < temp.length - i - 1; j++) {
                    if (temp[j] > temp[j + 1]) {
                        int temp1 = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = temp1;
                    }
                }
            }
            // overwrite array list
            list = temp;

        }

        public int get(int i) {
            //TODO
            if (i >= list.length) {
                throw new RuntimeException("Ungueltiger Index!");
            }
            return list[i];
        }

        @Override
        public String toString() { //Keep it as is
            return "SortedArrayList{" +
                    "list=" + Arrays.toString(list) +
                    '}';
        }
    }

    public static void test1() {
        SortedArrayList al = new SortedArrayList();
        System.out.println(al);
    }

    public static void test2() {
        SortedArrayList al1 = new SortedArrayList();
        System.out.println(al1);
        al1.add(1);
        System.out.println(al1);
        al1.add(3);
        System.out.println(al1);
        al1.add(2);
        System.out.println(al1);
    }

    public static void test3() {
        SortedArrayList al = new SortedArrayList();
        System.out.println(al);
        al.addAll(new int[]{1,2,3,4,5,10,7,11,8,8});
        System.out.println(al);
    }
}
