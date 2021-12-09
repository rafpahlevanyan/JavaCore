package lesson10;

public class MyExeption extends Exception {
    private int detail;

    MyExeption(int a) {
        detail = a;
    }

    public String toString() {
        return "MyExeption[ " + detail + " ]";
    }
}

class ExeptionDemo {
    static void compute(int a) throws MyExeption {
        System.out.println("Bызвaн метод compute (" + a + ")");
        if (a > 10)
            throw new MyExeption(a);
        System.out.println("Hopмaльнoe завершение");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyExeption e) {
            System.out.println("Пepexвaчeнo исключение: " + e);
        }
    }
}
