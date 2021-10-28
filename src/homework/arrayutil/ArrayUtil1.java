package homework.arrayutil;

public class ArrayUtil1 {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 6, 1, 13, 24, 33, 55, 79};
        int i;
        int max = array[0];
        int min = array[0];
        int oddCount = 0;
        int averageValue = 0;
        for (i = 0; i < array.length; i++) {
            averageValue+=array[i];
            System.out.println(array[i]);
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " is odd");
                oddCount++;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("odd Count is " + oddCount);
        System.out.println("even count is " + (array.length - oddCount));
        System.out.println("averageValue is " + averageValue/ array.length);
        System.out.println("sum is "+ averageValue);
    }
}