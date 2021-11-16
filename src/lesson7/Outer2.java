package lesson7;

public class Outer2 {
    int outer2_x = 100;
    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner1 {
                void display(){
                    System.out.println("вывoд: outer2_x " +outer2_x );
                }
            }
            Inner1 inner = new Inner1();
            inner.display();
        }
    }
}
class InnerClassDemo1{
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
