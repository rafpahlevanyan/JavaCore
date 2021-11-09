package homework.braceChecker;

import lesson6.Stack;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (from) [Java}";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
//        System.out.println("Error: opened [ but closed } at 20");
    }
}
