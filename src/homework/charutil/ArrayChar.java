package homework.charutil;

public class ArrayChar {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int match = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'o') {
                match++;
            }
        }
        System.out.print("count of o = " + match);
        System.out.println();
        System.out.print(bolola[bolola.length / 2 - 1]);
        System.out.println(bolola[bolola.length / 2]);

        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean match1 = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                match1 = true;
                break;
            }
        }
        System.out.println(match1);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' '};
        int firstindex = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                firstindex = i;
                break;
            }
        }
        int lastindex = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[text.length - 1 - i] != ' ') {
                lastindex = text.length - 1 - i;
                break;
            }
        }
        System.out.println("firstindex = " + firstindex);
        System.out.print("lastindex = " + lastindex);
        System.out.println();
        char[] result = new char[lastindex-firstindex+1];
        for (int i = 0; i < result.length; i++) {
            result[i]=text[firstindex+i];
            System.out.print(result[i]);
        }
    }
}

