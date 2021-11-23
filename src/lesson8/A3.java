package lesson8;

public class A3 {
    A3(){
        System.out.println("B конструкторе А. ");
    }
}
class B3 extends A3{
    B3(){
        System.out.println("B конструкторе B. ");
    }
}
class C3 extends B3{
    C3(){
        System.out.println("B конструкторе C. ");
    }
}
