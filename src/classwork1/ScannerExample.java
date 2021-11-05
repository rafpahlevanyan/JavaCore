package classwork1;

import calc.Calculator;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isWrongCommand;
        while (true) {
            System.out.println("Խնդրում ենք ներմուծել գործողությունը` (+ , - , * , / ): 0-ն դուրս գալու համար ");
            String operation = scanner.next();
            if (operation.equals("0")) {
                break;
            }
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Սխալ գործողություն");
            } else {
                System.out.println("Խնդրում ենք ներմուծել a-ն: ");
                int a = scanner.nextInt();
                System.out.println("Խնդրում ենք ներմուծել b-ն: ");
                int b = scanner.nextInt();
                System.out.print("Արժեքը հավասար է։ ");
                switch (operation) {
                    case "+":
                        System.out.println(calculator.plus(a, b));
                        break;
                    case "-":
                        System.out.println(calculator.minus(a, b));
                        break;
                    case "/":
                        System.out.println(calculator.divide(a, b));
                        break;
                    case "*":
                        System.out.println(calculator.multiple(a, b));
                        break;
                }
            }
        }
    }
}