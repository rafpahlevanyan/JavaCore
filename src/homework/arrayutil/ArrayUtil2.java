package homework.arrayutil;

public class ArrayUtil2 {
    public static void main(String[] args) {
        int[] array = {15, 55, 68, 44, 33, 62, 70, 88, 10, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("print all evens");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("print all odds");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.print("count of even " + evenCount);
        System.out.println();
        int oddcount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddcount++;
            }
        }
        System.out.println("count of odd " + oddcount);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum:" + sum);
        System.out.println("avg:" + sum / array.length);
    }

}
