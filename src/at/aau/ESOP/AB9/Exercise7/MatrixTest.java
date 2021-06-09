package at.aau.ESOP.AB9.Exercise7;

/**
 * Created by Nikita on 02.06.2021 at 13:11
 */
import java.util.Scanner;

public class MatrixTest {

    public static void main(String[] args) {
        MatrixTest test = new MatrixTest();
        test.testMatrix();
    }
    /**
     *In diesem Beispiel schreiben Sie die Klasse Matrix, welche eine int-Matrix repräsentiert und eine Methode zur
     * Matrixmultiplikation anbietet.
     * Die Klasse Matrix beinhaltet ein zwei 2-dimensionales int-Array matrix, auf welches nur von innerhalb der Klasse,
     * oder von Klassen welche von Matrix erben, zugegriffen werden kann. Das Array wird durch den Konstruktor
     * Matrix(int rows, int cols) mit der richtigen Größe initialisiert.
     * Schreiben Sie weiters die Getter int getNumberOfColumns() und int getNumberOfRows(), welche die Dimensionen der Matrix
     * zurückgeben. Der Getter int getElement(int row, int col) liefert den Matrizenwert an der Stelle row, col,
     *
     * der Setter void setElement(int row, int col, int value) setzt den Wert der Matrix an der Stelle row, col auf den Wert value.
     *
     * Überschreiben Sie weiters, die toString() Methode, sodass im zurückgegebenen String jede Zeile der Matrix in einer eigenen
     * Zeile steht und die Spalten durch ein Leerzeichen getrennt werden. Verwenden Sie dazu einen StringBuilder.
     *
     * Implementieren Sie die Methode isSquare(), die true zurückgibt, wenn die Matrix quadratisch ist, sonst false.
     *
     * Abschließend implementieren Sie die Methode Matrix multiply(Matrix factor), welche die aktuelle Matrix mit der gegebenen
     * Matrix multipliziert und das Ergebnis als neue Matrix zurückgibt. Die beiden Matrizen, welche bei der Multiplikation als
     * Faktoren dienen, sollen durch die Multiplikation nicht verändert werden. Gehen Sie davon aus, dass sich die Dimensionen
     * der gegebenen Matrizen für eine Multiplikation eigenen. Die Überprüfung auf inkompatible Dimensionen wird auf Blatt 9
     * erweitert.
     * Bei korrekter Implementierung sollte die Ausführung der testMatrix in der Klasse MatrixTest die gegebenen Testfälle
     * ausführen.
     * Wichtiger Hinweis: Sie müssen das Textfeld mit der Klasse Matrix und ihren Methoden befüllen.
     */
    class Matrix{

        protected int[][] matrix;

        public Matrix(int rows, int cols){
            matrix = new int[rows][cols];
        }

        public int getNumberOfColumns(){
            return matrix[0].length;
        }

        public int getNumberOfRows(){
            return matrix.length;
        }

        public int getElement(int row, int col){
            return matrix[row][col];
        }

        public void setElement(int row, int col, int value) {
            matrix[row][col] = value;
        }


        @Override
        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    stringBuilder.append(matrix[i][j]).append(" ");
                }
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        }

        public boolean isSquare() {
            if(this.matrix.length == this.matrix[0].length){
                return true;
            }
            return false;
        }

        public Matrix multiply(Matrix factor) {
            Matrix mult = new Matrix(this.matrix.length, factor.matrix[0].length);

            for(int i = 0; i < this.matrix.length; i++){
                for(int j = 0; j < factor.matrix[0].length; j++){
                    for(int k = 0; k < this.matrix[0].length; k++) {
                        mult.matrix[i][j] += this.matrix[i][k] * factor.matrix[k][j];
                    }
                }
            }
            return mult;
        }
    }

    public void testMatrix() {
        Scanner in = new Scanner(System.in);

        Matrix m1 = readMatrixFromStdIn(in);
        Matrix m2 = readMatrixFromStdIn(in);

        System.out.println(m1.isSquare());
        System.out.println(m2.isSquare());

        Matrix product = m1.multiply(m2);
        System.out.println(product.toString());
    }

    private Matrix readMatrixFromStdIn(Scanner in) {
        int rows = in.nextInt();
        int cols = in.nextInt();
        Matrix matrix = new Matrix(rows, cols);

        for (int i = 0; i < matrix.getNumberOfRows(); i++) {
            for (int j = 0; j < matrix.getNumberOfColumns(); j++) {
                matrix.setElement(i, j, in.nextInt());
            }
        }
        return matrix;
    }
}



