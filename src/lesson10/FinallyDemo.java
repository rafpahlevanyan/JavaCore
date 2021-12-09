package lesson10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("B теле метода procA() ");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("Блок оператора finally в методе procA() ");
        }
    }

    static void procB() {
        try {
            System.out.println("B теле метода procB() ");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB() ");
        }
    }

    static void procC() {
        try {
            System.out.println("B теле метода procC() ");
        } finally {
            System.out.println("Блок оператора finally в методе procC() ");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Иcключeниe перехвачено");
        }
        procB();
        procC();

    }
}
