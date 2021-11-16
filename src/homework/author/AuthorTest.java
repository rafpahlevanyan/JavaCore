package homework.author;


import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Author count: ");
        int i = scanner.nextInt();
        AuthorStorage authorStorage = new AuthorStorage();
        for (int j = 0; j < i; j++) {
            System.out.println("Please input author name: ");
            String name = scanner.next();
            System.out.println("Please input author surname: ");
            String surname = scanner.next();
            System.out.println("Please input author email: ");
            String email = scanner.next();
            System.out.println("Please input author age: ");
            int age = scanner.nextInt();
            System.out.println("Please input author gender: ");
            String gender = scanner.next();
            Author author = new Author(name, surname, email, age, gender);
            authorStorage.add(author);

        }

        authorStorage.print();
    }
}
