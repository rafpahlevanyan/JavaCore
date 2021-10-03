package lesson2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y-ic");

        x = x * 2;
        if (x == y)
            System.out.println("x теперь равно y-in");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y-ic");

        if (x == y) System.out.println("вы не увидите этого");

    }
}
