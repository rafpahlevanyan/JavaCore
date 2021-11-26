package lesson8;

abstract class A6 {
    abstract void callme();

    void callmetoo(){
        System.out.println("Этo конкретный метод. ");
    }
}
class B6 extends A6{
    void callme(){
        System.out.println("Реализация метода callme() в классе B. ");
    }
}
