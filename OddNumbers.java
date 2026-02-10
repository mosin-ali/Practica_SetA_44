import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int minOdd = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        int sum = 0;

        System.out.println("\nOdd numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

                sum += i;

                if (i < minOdd) {
                    minOdd = i;
                }

                if (i > maxOdd) {
                    maxOdd = i;
                }
            }
        }

        System.out.println("\n\nMinimum odd number: " + minOdd);
        System.out.println("Maximum odd number: " + maxOdd);
        System.out.println("Sum of odd numbers: " + sum);

        sc.close();
    }
}
