package homework.figure;

public class FigurePainter {

    void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureTwo(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void figureThree(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureFour(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureFive(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
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
