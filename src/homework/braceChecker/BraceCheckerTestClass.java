package homework.braceChecker;

public class BraceCheckerTestClass {
    public static void main(String[] args) {
        String text = "hello from{ Java";
        BraceCheckerClass braceCheckerClass = new BraceCheckerClass(text);
        braceCheckerClass.check();
    }
}
