package classwork;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] array = {9, 4, 7, 9, 55, 22, 7, 75, 13, 55};
        //տպել թե  որ էլեմենտներն է կրկնվում
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + "-ը կրկնվում է");
                    break;
                }
            }
        }
//        int[] array = {6, 4, 9, 7, 55, 22, 7, 75, 13, 55};
//        //տպել true եթե մասիվի բոլոր էլեմենտները զույգ են
//        // եթե ոչ false
//        boolean a = true;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                a = false;
//                break;
//                }
//            }
//        System.out.println( "մասսիվի բոլոր թվերը զույգ է " + a);
//    }
    }
}