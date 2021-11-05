package homework.dynamicArray;

import java.util.Arrays;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 0; i < 10; i++) {
            da.add(i);
        }
        System.out.println(da.getByIndex(12));
        System.out.println(da.getByIndex(14));
        for (int i = 0; i < 15; i++) {
            da.add(i);
        }
        da.print();
        System.out.println("Մասիվի երկարությունը։ " + da.getArrayLength());
        System.out.println("Մասիվի մեջ էլեմենտների քանակը։ " + da.getArraySize());
        da.add(2);
        da.print();
    }
}
