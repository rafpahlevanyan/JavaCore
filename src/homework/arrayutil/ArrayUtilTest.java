package homework.arrayutil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 7, 44, 55, 61, 14, 23, 63, 7, 52};
        int[] array2 = {55, 8, 48, 78, 23, 17, 36, 89, 2, 57};
        int arrayMax = arrayUtil.max(array);
        arrayUtil.print(array);
        int array2Max = arrayUtil.max(array2);
        arrayUtil.print(array2);

        if (arrayMax > array2Max) {
            System.out.println("Մեծ թիվը առաջին մասիվի մեջ է։ " + arrayMax);
        } else {
            System.out.println("Մեծ թիվը երկրորդ մասիվի մեջ է։ " + array2Max);
        }
        arrayUtil.evens(array);
        arrayUtil.evenCount(array);
        arrayUtil.odd(array);
        arrayUtil.oddCount(array);
        arrayUtil.sum(array);
        arrayUtil.avg(array);
        arrayUtil.sortminmax(array);
        arrayUtil.sortmaxmin(array);
    }
}
