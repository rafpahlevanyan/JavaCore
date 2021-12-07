package homework.education;

import homework.education.model.User;
import homework.education.storage.UserStorage;

import java.util.Scanner;


public class UserTest implements UserCommands {


    static Scanner scanner = new Scanner(System.in);
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            UserCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.err.println("invalid command");

            }
        }
    }

    private static void register() {
        System.out.println("Please enter your email");
        String email = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your surname");
        String surname = scanner.nextLine();
        System.out.println("Please enter user type");
        String type = scanner.nextLine();
        userStorage.add(new User(name, surname, email, password, type));
        System.out.println("You are registered");
        System.out.println();


    }

    private static void login() {
        System.out.println("Please enter your email");
        String email = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        User user = userStorage.checkUserExist(email, password);

        if (user != null) {
            switch (user.getType()) {
                case ADMIN:
                    ;
                    break;
                case USER:
                    ;
                    break;
            }


        } else {
            System.err.println("User does not exist");
            return;
        }

    }


}