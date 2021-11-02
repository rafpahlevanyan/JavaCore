package homework.charutil;

public class CharArrayTest {
    public static void main(String[] args) {
        CharUtil charUtil = new CharUtil();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' '};

        char[] result=charUtil.trim(text);
        for (char c : result) {
            System.out.print(c);

        }
    }
}
