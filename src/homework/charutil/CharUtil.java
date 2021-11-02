package homework.charutil;

public class CharUtil {
    char[] trim(char[] text) {
        int firstindex = 0;
        int lastindex = text.length - 1;

        while (firstindex < lastindex && text[firstindex] == ' ') {
            firstindex++;
        }
        while (firstindex < lastindex && text[lastindex] == ' ') {
            lastindex--;
        }
        char[] result = new char[(lastindex - firstindex) + 1];
        int index = 0;
        for (int i = firstindex; i <= lastindex; i++) {
            result[index++] = text[i];
        }
        return result;
    }
}
