import java.util.Arrays;
import java.util.Scanner;

public class Hometask3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("enter number to remove: ");
        int numToRemove = input.nextInt();
        int[] newArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numToRemove) {
                newArr[k] = arr[i];
                k++;
            }
        }
        if (k == arr.length) {
            System.out.println(" not found ");
            return;
        }
        int[] finalArr = Arrays.copyOf(newArr, k);
        System.out.println(Arrays.toString(finalArr));
    }
}
