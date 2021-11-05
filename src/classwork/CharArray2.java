package classwork;

public class CharArray2 {
    public static void main(String[] args) {
        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};
        //for first element
        System.out.println(charArray[0]);
        //for last element
        System.out.println(charArray[charArray.length - 1]);

        int count = 0;
        char c = 'o';
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count++;
            }
        }
        System.out.println("count of '" + c + "'=" + count);

        System.out.println(charArray[charArray.length / 2]);
        System.out.println(charArray[charArray.length / 2 + 1]);

        if (charArray[charArray.length - 2] == 'l' && charArray[charArray.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isBob = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                isBob = true;
                break;
            }
        }
        System.out.println(isBob);


        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' ', ' '};
        int startindex = 0;
        int endindex = text.length - 1;

        while (startindex < endindex && text[startindex] == ' ') {
            startindex++;
        }
        while (startindex < endindex && text[endindex] == ' ') {
            endindex--;
        }
        char[] result = new char[(endindex-startindex) + 1];
        int index = 0;
        for (int i = startindex; i <= endindex; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);


        }


    }
}
