package classwork;

public class SortArray2 {
    public static void main(String[] args) {
        int[] array = {9, 5, 77, 63, 42, 98, 9, 55, 75, 66};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}


