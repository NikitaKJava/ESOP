package at.aau.ESOP.AB10.Exercise6;

/**
 * Created by Nikita on 09.06.2021 at 10:39
 */
public class NoHumanAgeExceptionTest {
    public static void main(String[] args) {

//        try {
//            System.out.println(AgeChecker.isSeniorAge(-1));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        // -------------------
//        try {
//            System.out.println(AgeChecker.isSeniorAge(120));
//        } catch (Exception e) {
//            System.out.println("bad exception");
//        }
        // -------------------
        try {
            System.out.println(AgeChecker.isSeniorAge(120));
        } catch (Exception e) {
            System.out.println("bad exception");
        }
    }

    /**
     * Implementieren Sie die Methode public boolean isSeniorAge(int age). Diese Methode soll prüfen, ob im Parameter age ein
     * gültiges Alter im Sinne unserer Definition gespeichert ist. Ein Alter ist grundsätzlich gültig wenn es zwischen 0 und 120
     * liegt (beide inklusive).
     * <p>
     * Bei einem ungültigen Alter soll die Methode eine checked Exception namens NoHumanAgeExceptionTest werfen. Der Text der
     * Exception soll bei zu kleinem Alter "Alter zu klein. Muss mindestens 0 sein." sein und bei zu großem Alter "Alter zu gross.
     * Darf maximal 120 sein.". Erstellen Sie die NoHumanAgeExceptionTest selbst und vergewissern Sie sich, dass Sie eine checked
     * Exception erstellen.
     * <p>
     * Bei einem grundsätzlich gültigen Alter soll die Methode true zurückgeben, wenn das Alter zwischen 60 und 120 liegt
     * (beide inklusive) und ansonsten false.
     */

    static class AgeChecker {
        public static boolean isSeniorAge(int age) throws NoHumanAgeException {
            //TODO Put your code here

            if (age < 0) {
                throw new NoHumanAgeException("Alter zu klein. Muss mindestens 0 sein.");
            }

            else if (age > 120) {
                throw new NoHumanAgeException("Alter zu gross. Darf maximal 120 sein.");
            } else {
                return age >= 60;
            }
        }
    }

        static class NoHumanAgeException extends Exception {
        //TODO Put your code here
        public NoHumanAgeException(String errorMessage) {
            super(errorMessage);
        }
    }
}
