package homework.dynamicArray;

public class DynamicArrayTestClass {

    public static void main(String[] args) {

        DynamicArrayClass dy = new DynamicArrayClass();
        dy.add(33);
        dy.add(43);
        dy.add(53);
        dy.add(63);
        dy.add(73);
        dy.add(83);


        dy.print();

        dy.add(93);
        dy.add(103);
        dy.add(113);
        dy.add(123);
        dy.add(133);
        dy.add(143);
        dy.add(153);

        dy.print();
        dy.getByIndex(25);

    }

}
