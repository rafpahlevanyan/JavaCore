package homework.education.impl;

public interface UserCommands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";


    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + LOGIN + " for login ");
        System.out.println("Please input " + REGISTER + " for register ");

    }
}
