package lesson10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("B теле метода throwOne(). ");
        throw new IllegalAccessException("Demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException r) {
            System.out.println("Пepexвaчeнo исключение: " + r);
        }
    }
}

