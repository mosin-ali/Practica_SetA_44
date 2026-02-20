// public class FullPyramid {
//     public static void main(String[] args) {

//         int rows = 5;

//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



public class FullPyramid {

    public static void main(String[] args) {

        // -------------------------------
        // 1. Inverted Right Half Pyramid (Stars)
        // -------------------------------
        int rows = 6;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // One blank line between patterns
        System.out.println();

        // -------------------------------
        // 2. Number Pattern
        // -------------------------------
        int num = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;

                // Reset after 9
                if (num == 10) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}