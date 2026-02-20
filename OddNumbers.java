// import java.util.Scanner;

// public class OddNumbers {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter starting number: ");
//         int start = sc.nextInt();

//         System.out.print("Enter ending number: ");
//         int end = sc.nextInt();

//         int minOdd = Integer.MAX_VALUE;
//         int maxOdd = Integer.MIN_VALUE;
//         int sum = 0;

//         System.out.println("\nOdd numbers between " + start + " and " + end + ":");

//         for (int i = start; i <= end; i++) {
//             if (i % 2 != 0) {
//                 System.out.print(i + " ");

//                 sum += i;

//                 if (i < minOdd) {
//                     minOdd = i;
//                 }

//                 if (i > maxOdd) {
//                     maxOdd = i;
//                 }
//             }
//         }

//         System.out.println("\n\nMinimum odd number: " + minOdd);
//         System.out.println("Maximum odd number: " + maxOdd);
//         System.out.println("Sum of odd numbers: " + sum);

//         sc.close();
//     }
// }





import java.util.Scanner;
import java.util.ArrayList;

public class OddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -----------------------------
        // ODD NUMBERS (User Input Range)
        // -----------------------------
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int minOdd = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        int sumOdd = 0;

        System.out.println("\nOdd numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumOdd += i;

                if (i < minOdd) {
                    minOdd = i;
                }

                if (i > maxOdd) {
                    maxOdd = i;
                }
            }
        }

        System.out.println("\nMinimum odd number: " + minOdd);
        System.out.println("Maximum odd number: " + maxOdd);
        System.out.println("Sum of odd numbers: " + sumOdd);

        // =====================================================
        // EVEN NUMBERS (1 to 50)
        // =====================================================
        System.out.println("\nEven numbers between 1 and 50:");

        ArrayList<Integer> evenList = new ArrayList<>();
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
                sumEven += i;
            }
        }

        // Print even numbers
        for (int num : evenList) {
            System.out.print(num + " ");
        }

        // Three minimum even numbers
        System.out.println("\nThree minimum even numbers: "
                + evenList.get(0) + ", "
                + evenList.get(1) + ", "
                + evenList.get(2));

        // Three maximum even numbers
        int size = evenList.size();
        System.out.println("Three maximum even numbers: "
                + evenList.get(size - 3) + ", "
                + evenList.get(size - 2) + ", "
                + evenList.get(size - 1));

        // Average of even numbers
        double averageEven = (double) sumEven / evenList.size();
        System.out.println("Average of even numbers: " + averageEven);

        sc.close();
    }
}