package lesson8;

public class A1 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B1 extends A1 {
    int total;

//    void sum() {
//        total = i + j;
//    }
}

class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();

        subOb.setij(10, 12);

//        subOb.sum();
        System.out.println("Cyммa равна " + subOb.total);

    }
}

