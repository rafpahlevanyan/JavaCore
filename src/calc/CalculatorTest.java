package calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        int result = mycalculator.plus(5, 6);
        System.out.println(result);
        result = mycalculator.minus(10, 5);
        System.out.println(result);
        double result2 = mycalculator.divide(30, 5);
        System.out.println(result2);
        long result3 = mycalculator.multiple(5, 4);
        System.out.println(result3);
    }
}
