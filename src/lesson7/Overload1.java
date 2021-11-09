package lesson7;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob1 = new OverloadDemo1();
        int i = 88;
        ob1.test();
        ob1.test(10,20);
        ob1.test(i);
        ob1.test(123.2);

    }
}
