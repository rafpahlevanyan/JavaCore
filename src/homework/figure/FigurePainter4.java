package homework.figure;

public class FigurePainter4 {
    public static void main(String[] args) {
//     *****
//      ****
//       ***
//        **
//         *
        for (int i = 0; i < 7; i++) {
            for (int j = 1; j < 6 + i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}