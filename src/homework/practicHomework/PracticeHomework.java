package homework.practicHomework;

public class PracticeHomework {
    long convert(int minutes) {
        System.out.print("Արժեքը վարկյանով հավասար է։ ");
        return minutes * 60;
    }

    int calcAge(int years) {
        System.out.print("Արժեքը օրերով հավասար է։ ");
        return years * 365;
    }

    int nextNumber(int number) {
        System.out.print("Հաջորդ թիվը հավասար է։ ");
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        System.out.print("Արժեքները հավասար են։ ");
        if (a == b) { //return a==b
            return true;
        } else {
            return false;
        }

    }

    boolean lessThanOrEqualToZero(int number) {
        System.out.print("Արժեքը փոքր կամ հավասար է 0-ի։ ");
        if (number <= 0) { //return number<=0
            return true;
        } else {
            return false;
        }
    }
    boolean reverseBool(boolean value){
        System.out.print("Արժեքը հավասար է։ ");
        return !value;
    }
    int maxLength(int[] array1, int[] array2){
        System.out.print("Մասսիվների ամենամեծ երկարությունը։ ");
        if (array1.length > array2.length){//return array1.length>array2.length?array1.length:array2.length;
            return array1.length;
        }else {
            return array2.length;
        }
    }
}
