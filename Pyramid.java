// public class Pyramid {
//     public static void main(String[] args) {

//         int rows = 6;

//         for (int i = rows; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


public class Pyramid {

    public static void main(String[] args) {

        int rows = 5;

        // ---------------------------------
        // 1. Right Half Pyramid (Centered)
        // ---------------------------------
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // ---------------------------------
        // 2. Inverted Alphabet Pattern (Shifted)
        // ---------------------------------
        for (int i = rows; i >= 1; i--) {

            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            char ch = 'A';

            // Print letters
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}