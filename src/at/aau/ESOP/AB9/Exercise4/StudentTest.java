package at.aau.ESOP.AB9.Exercise4;

import java.util.Scanner;
/**
 * Created by Nikita on 27.05.2021 at 09:50
 */

public class StudentTest {

    public static void main(String[] args) {
        StudentTest st = new StudentTest();
//        st.testToString();
//        st.testGetSum();
//        st.testToStringWithoutECTS();
        st.testGetSumWithoutECTS();
    }
    /**
     * Informieren Sie sich zuerst:
     *
     *     Was bedeuten public, private und protected?
     *     Wozu werden sogenannte Getter und Setter benötigt?
     *     Wozu dient ein Konstruktor?
     *     Wann kommt der Default Konstruktor zum Einsatz und wie sieht dieser aus?
     *
     * Schreiben Sie die Klasse Student, welche die Daten eines Studierenden speichert. Die Klasse soll wie folgt aufgebaut sein.
     *
     *     - Die String-Attribute firstName und surName speichern den Vor- und Nachnamen des Studierenden. Ein direkter Zugriff auf
     *       diese Attribute von außerhalb der Klasse darf nicht möglich sein.
     *     - Das String-Attribut matNr speichert die Matrikelnummer.
     *     - Ein Konstruktor, der firstName, surName und matNr als Parameter nimmt.
     *     - Ein Standard-Konstruktor, der sein Objekt ohne Argumente initialisiert.
     *     - Die Liste der Namen der besuchten Lehrveranstaltungen wird in dem Attribut lectures  gespeichert.
     *     - Die Liste der erreichten ECTS  ects speichert die ECTS zu jeder LV.
     *     - Verwenden Sie Arrays um die Lehrveranstaltungen bzw. die ECTS zu verwalten.
     *     - Sie können davon ausgehen, dass es zu jeder Lehrveranstaltung eine ECTS-Anzahl gibt und dass jeweils die passende LV
     *       und ECTS sich beim gleichen Index im Array befinden.
     *     - Schreiben Sie Setter und Getter für alle Attribute und halten Sie sich dabei an die Namenskonventionen.
     *     - Die Daten firstName, surName und matNr sollen auch über den Konstruktor gesetzt werden können.
     *     - Überschreiben Sie die Methode toString() und geben Sie die Daten des Studierenden in folgendem Format aus:
     *       "Name: <firstName>, <surName>
     *       MatNr: <matNr>
     *      Lectures:
     *      -<lecture1>: (<ects1>)
     *      -<lecture2>: (<ects2>)
     *      ..."
     *     Wenn der Studierende noch keine Lehrveranstaltungen oder ECTS angegeben hat, wird der entsprechende Teil bei der
     *     Ausgabe weggelassen.
     * Schreiben Sie die Methode int getSumECTS(), die Gesamtanzahl der ECTS aller LVs berechnet und zurückgibt. Wurden
     * noch keine ECTS gespeichert, wird 0 zurückgegeben.
     *
     * Lesen Sie sich in die Klasse StudentTest ein. Bei korrekter Implementierung sollte die main-Methode der Klasse
     * StudentTest fehlerfrei ausgeführt werden können.
     */

    class Student{
        String firstName;
        String surName;
        String matNr;
        String[] lectures;
        int[] ects;

        public Student(String firstname, String surname, String matnr){
            this.firstName = firstname;
            this.surName = surname;
            this.matNr = matnr;
        }
        Student(){}

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public String getMatNr() {
            return matNr;
        }

        public void setMatNr(String matNr) {
            this.matNr = matNr;
        }

        public String[] getLectures() {
            return lectures;
        }

        public int[] getEcts() {
            return ects;
        }

        public void setLectures(String[] lectures){
            this.lectures = new String[lectures.length];
            for (int i = 0; i < lectures.length; i++) {
                this.lectures[i] = lectures[i];
            }
        }

        public void setEcts(int[] ects){
            this.ects = new int[ects.length];

            for (int i = 0; i < ects.length; i++) {
                this.ects[i] = ects[i];
            }
        }

        public int getSumECTS(){
            int sum = 0;
            if(ects != null) {
                for (int i = 0; i < ects.length; i++) {
                    sum += ects[i];
                }
            }
            return sum;
        }

        @Override
        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.format("Name: %s, %s\nMatNr: %s", firstName, surName, matNr));
            // without lectures and ects
            if(lectures != null && ects != null) {
                stringBuilder.append("\nLectures:\n");

                for (int i = 0; i < lectures.length; i++) {
                    stringBuilder.append("-" + lectures[i] + ": (" + ects[i] + ")\n");
                }
            }
            return stringBuilder.toString();
        }
    }

    private void testToString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<firstname> <surname> <matnr>");
        Student s1 = new Student(sc.next(), sc.next(), sc.next());
        System.out.println("<lv1> <lv2> <lv3> <lv4> <lv5>");
        String[] lectures = new String[]{sc.next(), sc.next(), sc.next(), sc.next(), sc.next()};
        s1.setLectures(lectures);
        System.out.println("<ects1> <ects2> <ects3> <ects4> <ects5>");
        int[] ects = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        s1.setEcts(ects);
        System.out.println(s1.toString()); // es werden die daten inkl. lvs und ects ausgegeben
    }

    private void testGetSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<firstname> <surname> <matnr>");
        Student s1 = new Student(sc.next(), sc.next(), sc.next());
        System.out.println("<lv1> <lv2> <lv3> <lv4> <lv5>");
        String[] lectures = new String[]{sc.next(), sc.next(), sc.next(), sc.next(), sc.next()};
        s1.setLectures(lectures);
        System.out.println("<ects1> <ects2> <ects3> <ects4> <ects5>");
        int[] ects = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        s1.setEcts(ects);
        System.out.println(s1.getSumECTS());
    }

    private void testToStringWithoutECTS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<firstname> <surname> <matnr>");
        Student s1 = new Student(sc.next(), sc.next(), sc.next());
        System.out.println(s1.toString());
    }

    private void testGetSumWithoutECTS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("<firstname> <surname> <matnr>");
        Student s1 = new Student(sc.next(), sc.next(), sc.next());
        System.out.println("<lv1> <lv2> <lv3> <lv4> <lv5>");
        String[] lectures = new String[]{sc.next(), sc.next(), sc.next(), sc.next(), sc.next()};
        s1.setLectures(lectures);
        System.out.println(s1.toString());
    }
}