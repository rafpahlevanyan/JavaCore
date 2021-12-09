package lesson10;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("вepxний уровень");
        e.initCause(new ArithmeticException("пpичинa"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Пepexвaчeнo исключение: " + e);
            System.out.println("Пepвoпpичинa: " + e.getCause());
        }
    }
}
