package homework.dynamicArray;

public class DynamicArrayClass {

    private int[] array;
    private int size = 0;

    DynamicArrayClass() {
        array = new int[10];
    }

    DynamicArrayClass(int length) {
        array = new int[length];
    }

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + (array.length / 2)];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index: " + index);
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
