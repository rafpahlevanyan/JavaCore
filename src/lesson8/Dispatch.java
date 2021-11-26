package lesson8;

public class Dispatch {
    public static void main(String[] args) {


        A5 a5 = new A5();
        B5 b5 = new B5();
        C5 c5 = new C5();

        A5 r;

        r = a5;
        r.callme();

        r = b5;
        r.callme();

        r = c5;
        r.callme();
    }
}