package example;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 6, 12, 85, 66, 33, 42, 10};
        int n = array.length;
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - i] < array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;

                }
                System.out.println(array[]);
            }

        }

    }
}
