package at.aau.ESOP.AB8.Exercise5;
/**
 * Created by Nikita on 25.05.2021 at 22:14
 */
import java.util.Arrays;

public class DeepLearningTest {
    public static void main(String[] args){
        DeepLearning deeplearning = new DeepLearning();
//        double[] input = new double[]{5.0, 5.0};
//        double[] input = new double[]{};
//        double[] input = new double[]{0.0};
        double[] input = new double[]{-99, -9, -0.9, -0.09};
        double[] output = deeplearning.softmax(input);
        System.out.println(Arrays.toString(output));
    }

    public static class DeepLearning{

        public double[] softmax(double[] array){

            // new array
            double[] arr = new double[array.length];
            // e^zi numerator
            for (int i = 0; i < array.length; i++) {
                arr[i] = Math.exp(array[i]);
            }
            // sum denominator
            double sum = 0;
            for(int i = 0; i < array.length; i++) {
                sum += arr[i];
            }
            // numerator / denominator
            double[] result = new double[array.length];
            for(int i = 0; i < array.length; i++) {
                result[i] = arr[i] / sum;
            }
            return result;
        }
    }
}