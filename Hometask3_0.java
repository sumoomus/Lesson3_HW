import java.util.Scanner;

public class Hometask3_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.println("num " + number + " array");
                found = true;
            }
        }

        if (!found) {
            System.out.println("num " + number + " not array");
        }
    }
}
