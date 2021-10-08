package homework.figure;

public class FigurePainter5 {
    public static void main(String[] args) {
//       *
//      * *
//     * * *
//    * * * *
//     * * *
//      * *
//       *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int l = 0; l < 5; l++) {
            for (int p = 0; p < 4 + l; p++) {
                System.out.print(" ");
            }
            for (int r = 3; r > l; r--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

