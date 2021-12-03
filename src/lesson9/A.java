package lesson9;

public class A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}


