package lesson8;

public class A5 {
    void callme(){
        System.out.println("B методе callme() из класса А ");
    }
}
class B5 extends A5{
    void callme(){
        System.out.println("B методе callme() из класса B ");
    }
}
class C5 extends A5{
    void callme(){
        System.out.println("B методе callme() из класса C ");
    }
}