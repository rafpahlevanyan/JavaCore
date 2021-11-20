package homework.author;


import java.util.Scanner;

public class AuthorTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHORS = "2";
    private static final String SEARCH_AUTHORS_BY_AGE = "3";
    private static final String PRINT_AUTHORS = "4";
    private static final String ADD_BOOK = "5";
    private static final String PRINT_BOOKS = "6";
    private static final String SEARCH_BOOKS_BY_TITLE = "7";

    public static void main(String[] args) {
        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.com", 25, "male"));
        authorStorage.add(new Author("armenuhi", "armenyan", "armenuhi@mail.com", 23, "female"));
        authorStorage.add(new Author("armen", "armenyan", "armen@mail.com", 27, "male"));
        bookStorage.add(new Book("Sasna crer","epos",10500,2));
        bookStorage.add(new Book("Vardananq","epos",9500,4));
        bookStorage.add(new Book("Khenty","drama",11500,3));
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case ADD_BOOK:
                    addBook();
                case PRINT_BOOKS:
                    bookStorage.print();
                case SEARCH_BOOKS_BY_TITLE:
                    searchByTitle();
                default:
                    System.out.println("Invalid command!");
            }

        }
    }

    private static void searchByTitle() {
        System.out.println("Please input the title: ");
        String title = scanner.nextLine();
        bookStorage.serachByTitle(title);
    }


    private static void addBook() {
        System.out.println("Please input book`s title: ");
        String title = scanner.nextLine();
        System.out.println("Please input book`s description: ");
        String description = scanner.nextLine();
        System.out.println("Please input book`s price: ");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input book`s count: ");
        int count = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, description, price,count);
        bookStorage.add(book);
        System.out.println("Book was added");

    }

    private static void searchByAge() {
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for add author");
        System.out.println("Please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("Please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("Please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + PRINT_BOOKS + " for print books");

    }

    private static void searchByName() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("Please input author's name");
        String name = scanner.nextLine();
        System.out.println("Please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        System.out.println("Please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("Please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, email, age, gender);
        authorStorage.add(author);
        System.out.println("Thank you, author was added");
    }

}