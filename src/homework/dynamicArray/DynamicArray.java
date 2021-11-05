package homework.dynamicArray;

public class DynamicArray {
    //սա մե հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    public int getArrayLength() {
        return array.length;
    }

    public int getArraySize() {
        return size;
    }

    //ստուգել եթե մասիվի մեջ տեղ չկա -> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size < array.length) {
            array[size] = value;
            System.out.println(array[size]);
        } else {
            extend();
            array[size] = value;
        }
        size++;
    }

    //ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //գցել հին մասիվի էլեմենտները նորի մեջ
    //հին մասիվի հղումը կապենք նոր մասիվի հղման հետ
    private void extend() {
        int[] newArray = new int[array.length + 10];
        System.arraycopy(array, 0, newArray, 0, array.length);
 //     //   for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//        }
        array = newArray;

    }


    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդքսի սահմաններում է ,
    //վերադարցնել մասիվի index-երորդ էլեմենտը։Հակառակ դեպքում վերադարձնել -1
    public int getByIndex(int index) {
        if (index > size) {
            return -1;
        }
        return array[index];
    }


    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}



