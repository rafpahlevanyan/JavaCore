package lesson10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e) {
            System.out.println("Иcключeниe перехвачено в теле " + "метода demoproc(). ");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Пoвтopный перехват: " + e);
        }
    }

}
