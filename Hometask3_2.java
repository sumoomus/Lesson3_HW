import java.util.Scanner;

public class Hometask3_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        double avg = (double) sum / size;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}

