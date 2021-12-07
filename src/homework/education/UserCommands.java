package homework.education;

public interface UserCommands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";
    String ADMIN = "ADMIN";
    String USER = "USER";


    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + LOGIN + " for login ");
        System.out.println("Please input " + REGISTER + " for register ");

    }
}
