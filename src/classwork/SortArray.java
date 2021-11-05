package classwork;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 6, 12, 85, 66, 33, 42, 10};
        int n = array.length;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
