package homework.dynamicArray;

public class DynamicArrayTestClass {

    public static void main(String[] args) {

        DynamicArrayClass dy = new DynamicArrayClass();
        dy.isEmpty();
        System.out.println(dy.isEmpty());
//        dy.add(33);
//        dy.add(43);
//        dy.add(53);
//        dy.add(63);
//        dy.add(73);
//        dy.add(83);
//
//
//        dy.print();
//
//        dy.add(93);
//        dy.add(103);
//        dy.add(113);
//        dy.add(123);
//        dy.add(133);
//        dy.add(143);
//        dy.add(153);
//
//        dy.print();
//        dy.getByIndex(25);
        for (int i = 0; i < 10; i++) {
            dy.add(i+1);
        }

        dy.print();
        dy.delete(4);
        dy.print();
        int [] numbers = {33,44,55};
        dy.add(numbers);
        dy.print();

        dy.add(66,2);
        dy.print();

        dy.set(22,0);
        dy.print();
        dy.isEmpty();
        System.out.println(dy.isEmpty());


        System.out.println(dy.isExists(10));


    }

}
