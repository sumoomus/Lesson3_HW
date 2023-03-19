import java.util.Arrays;

public class Hometask3_3 {


        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {6, 7, 8, 9, 10};

            System.out.println("Array 1: " + Arrays.toString(array1));
            System.out.println("Array 2: " + Arrays.toString(array2));

            double sum1 = 0;
            double sum2 = 0;

            for (int i = 0; i < array1.length; i++) {
                sum1 += array1[i];
            }
            for (int i = 0; i < array2.length; i++) {
                sum2 += array2[i];
            }

            double avg1 = sum1 / array1.length;
            double avg2 = sum2 / array2.length;

            if (avg1 > avg2) {
                System.out.println("average of array 1 is greater  than array 2.");
            } else if (avg1 < avg2) {
                System.out.println(" average of array 2 is greater than array 1.");
            } else {
                System.out.println("both arrays are equal.");
            }
        }
    }
