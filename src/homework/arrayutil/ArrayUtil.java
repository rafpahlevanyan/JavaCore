package homework.arrayutil;

public class ArrayUtil {
    int max(int[] array) {
        int max = array[0];
//        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    void print(int[] array) {
        System.out.print("մասիվի թվերն են: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void evens(int[] array) {
        System.out.print("մասիվի զույգ թվերն են: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void evenCount(int[] array) {
        System.out.print("զույգ թվերի քանակը։ ");
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;

            }
        }
        System.out.println(evenCount);

    }

    void odd(int[] array) {
        System.out.print("մասիվի կենտ թվերն են: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void oddCount(int[] array) {
        System.out.print("կենտ թվերի քանակը։ ");
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);
    }

    void sum(int[] array) {
        System.out.print("մասիվի թվերի գումարը։ ");
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    void avg(int[] array) {
        System.out.print("մասիվի միջին թվաբանականը։ ");
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        System.out.println(avg / array.length);
    }

    void sortminmax(int[] array) {
        System.out.print("մասիվը սորտավորված փոքրից-մեծ։ ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void sortmaxmin(int[] array) {
        System.out.print("մասիվը սորտավորված մեծից-փոքր։ ");
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
        System.out.println();
    }
}
