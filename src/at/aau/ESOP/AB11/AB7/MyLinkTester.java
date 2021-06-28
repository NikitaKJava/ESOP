package at.aau.ESOP.AB11.AB7;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Nikita on 19.06.2021 at 12:56
 */
public class MyLinkTester {

    /**
     * In dieser Übung werden Sie eine LinkedList-Datenstruktur von Grund auf neu implementieren.
     * <p>
     * Erstellen Sie die Klasse Node, diese enthält folgende Attribute:
     * - value: ein integer-Wert des aktuellen Knotens.
     * - nextNode: ein Node-Objekt, das die Referenz auf den nächsten Knoten speichert.
     * <p>
     * Und ein Konstruktor, der als Argument ein integer nimmt, die den Wert des Knotens darstellt.
     * Außerdem enthält sie für jedes Attribut einen Getter und einen Setter.
     * <p>
     * Erstellen Sie anschließend die Klasse MyList mit folgenden Attributen:
     * - length: ein integer-Wert, der die aktuelle Länge der Liste (d. h. die aktuelle Anzahl der gespeicherten Elemente) speichert
     * - head: ein Node-Objekt, das die Referenz auf den Kopf der Liste (d. h. das erste Element) speichert.
     * Definieren Sie keine Getter/Setter. Auf die Attribute kann von außen nicht zugegriffen werden, aber Klassen die von der Klasse MyList erben, müssen auf sie zugreifen können.
     * <p>
     * MyList muss auch einen Konstruktor haben, der seine Attribute initialisiert.
     * <p>
     * Definieren Sie außerdem die folgenden Methoden:
     * - public void add(int value): Diese Methode fügt einen Wert am Ende der Liste hinzu.
     * - public int remove(int index): Diese Methode entfernt einen bestimmten Index und gibt den Wert dieses Indexes zurück. Vorsicht, überprüfen Sie vorher ob der Index existiert.
     * - public int length(): Gibt die aktuelle Länge der Liste zurück.
     * - public int get(int index): Gibt den Wert zurück, der am aktuellen Knotenindex gespeichert ist.
     * - public String toString(): Gibt den Inhalt der Liste aus, eine Zahl nach der anderen, getrennt durch ein Leerzeichen. Die letzte Zahl sollte rechts kein Leerzeichen haben.
     * <p>
     * Beim Aufruf mit einem illegalen Index (z.B. Index ist kleiner als 0, größer als Länge, ...) sollten die Methoden int get(int index) und int remove(int index) eine IllegalArgumentException auslösen:
     * <p>
     * throw new IllegalArgumentException("Out of bound index!");
     */
    public static void main(String[] args) {
        // Test your code here
//        testAddMethod();
//        testAddAndRemoveMethod();
        testGetMethod();
//        testGetAllMethod();
//        testFillAndEmpty();
//        testFillAndEmptyBottom();
    }

    public static class Node {
        protected int value = 0;
        protected Node nextNode;

        Node(int value) {
            this.value = value;
            this.nextNode = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    public static class MyList {
        protected int length;
        protected Node head;

        MyList() {}

        public void add(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = node;
            } else {
                Node current = head;
                while (current.nextNode != null) {
                    current = current.nextNode;
                }
                node.nextNode = current.nextNode;
                current.nextNode = node;

            }
            length++;
        }

        public int remove(int index) {
            Node currentNode = head;
            Node prevNode = null;
            int val = 0;
            int i = 0;

            if (index < 0 || index >= length) {
                throw new IllegalArgumentException("Out of bound index!");
            } else {
                while (currentNode != null && i < index) {
                    prevNode = currentNode;
                    currentNode = currentNode.nextNode;
                    i++;
                }
                if (currentNode != null && prevNode == null) {
                    if (currentNode.nextNode != null) {
                        head = currentNode.nextNode;
                    } else {
                        head = null;
                    }
                } else if (currentNode != null) {
                    prevNode.nextNode = currentNode.nextNode;
                }
                length--;

                return currentNode.getValue();
            }
        }

        public int length() {
            return this.length;
        }

        public int get(int index) {
            Node currentNode = head;
            Node prevNode = null;
            int i = 0;

            if (index < 0 || index >= length) {
                throw new IllegalArgumentException("Out of bound index!");
            } else {
                while (currentNode != null && i < index) {
                    prevNode = currentNode;
                    currentNode = currentNode.nextNode;
                    i++;
                }
            }
            return currentNode.getValue();
        }

        public String toString() {
            Node currnode = head;
            StringBuilder builder = new StringBuilder();
            while (currnode != null) {
                builder.append(currnode.value + " ");
                currnode = currnode.nextNode;
            }
            return builder.toString().trim();
        }


    }

    static void testAddMethod() {
        System.out.println(("Testing add method:").toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements:");
        int numElements = in.nextInt();

        MyList myList = new MyList();

        for (int i = 0; i < numElements; i++) {
            System.out.println("add value to index " + i + ": ");
            myList.add(in.nextInt());
        }
        System.out.println(myList.length());
        System.out.println(myList);

    }

    static void testAddAndRemoveMethod() {
        System.out.println(("testing add and remove method:").toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        MyList myList = new MyList();
        System.out.println("myList length: " + myList.length());
        System.out.println("add value");
        int toAdd = in.nextInt();
        try {
            myList.add(toAdd);
            System.out.println("myList length: " + myList.length());
            System.out.println("index to remove:\n");
            int indexToRemove = in.nextInt();
            System.out.println(myList.remove(indexToRemove));
            System.out.println("myList length: " + myList.length());
        } catch (IllegalArgumentException e) {
            System.out.print("IllegalArgumentException raised!");
        }

    }

    static void testGetMethod() {
        System.out.println(("testing get method:").toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements:");
        int numElements = in.nextInt();

        MyList myList = new MyList();
        for (int i = 0; i < numElements; i++) {
            System.out.println("add value to index " + i + ": ");
            myList.add(in.nextInt());
        }
        System.out.println("myList length: " + myList.length());
        try {
            System.out.println("choose index to see the value: ");
            System.out.print("Value at index: " + myList.get(in.nextInt()));
        } catch (IllegalArgumentException e) {
            System.out.print("IllegalArgumentException raised!");
        }
    }

    static void testGetAllMethod() {
        System.out.println(("testing get all method:").toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements: ");
        int numElements = in.nextInt();

        MyList myList = new MyList();

        for (int i = 0; i < numElements; i++) {
            System.out.println("add value to index " + i + ": ");
            myList.add(in.nextInt());
        }
        System.out.println("myList length: " + myList.length());
        System.out.print("all values of myList: ");
        for (int i = 0; i < myList.length(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("\n");
    }

    static void testFillAndEmpty() {
        System.out.println(("testing fill and empty method:").toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements:");
        int numElements = in.nextInt();

        MyList myList = new MyList();

        for (int i = 0; i < numElements; i++) {
            System.out.println("add value to index " + i + ": ");
            myList.add(in.nextInt());
        }
        while (myList.length() > 0) {
            System.out.print("value " + myList.remove(0) + " at index 0 is removed\n");
        }
    }

    static void testFillAndEmptyBottom() {
        System.out.println(("testing fill and empty bottom methode:").toUpperCase(Locale.ROOT));
        Scanner in = new Scanner(System.in);
        System.out.println("number of elements:");
        int numElements = in.nextInt();

        MyList myList = new MyList();

        for (int i = 0; i < numElements; i++) {
            System.out.println("add value to index " + i + ": ");
            myList.add(in.nextInt());
        }
        while (myList.length() > 0) {
            System.out.print("value " + myList.remove(myList.length() - 1) + " at index " + myList.length() + " is removed\n");
        }
    }
}