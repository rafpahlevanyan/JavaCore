package homework.practicHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        long minutes = practiceHomework.convert(1);
        System.out.println(minutes);
        int year = practiceHomework.calcAge(2);
        System.out.println(year);
        int number = practiceHomework.nextNumber(3);
        System.out.println(number);
        boolean samenum = practiceHomework.isSameNum(5, 5);
        System.out.println(samenum);
        boolean equalzero = practiceHomework.lessThanOrEqualToZero(0);
        System.out.println(equalzero);
        boolean reversebool = practiceHomework.reverseBool(false);
        System.out.println(reversebool);

        int[] array1 = {5, 60, 33, 20, 54, 2, 11};
        int[] array2 = {5, 60, 33, 20, 54, 2, 11, 44, 77, 88, 56, 30};
        int maxlength = practiceHomework.maxLength(array1,array2);
        System.out.println(maxlength);
    }
}