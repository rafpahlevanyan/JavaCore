package lesson5;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд " + i + ": ");
        }
        for (int j = 0; j < 100; j++) {
            System.out.print(j + " ");
        }
    }
}
