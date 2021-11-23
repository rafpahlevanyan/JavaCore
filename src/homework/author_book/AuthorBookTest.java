package homework.author_book;


import java.util.Scanner;

public class AuthorBookTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNTS_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";


    public static void main(String[] args) {
        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.com", 25, "male"));
        authorStorage.add(new Author("armenuhi", "armenyan", "armenuhi@mail.com", 23, "female"));
        authorStorage.add(new Author("armen", "armenyan", "armen@mail.com", 27, "male"));

//        bookStorage.add(new Book("Sasna crer", "epos", 10500, 2 , ));
//        bookStorage.add(new Book("Vardananq", "epos", 9500, 4 ,"poxos@mail.ru"));
//        bookStorage.add(new Book("Khenty", "drama", 11500, 3 ,"armen@mail.ru"));

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
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchByTitle();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case COUNTS_BOOKS_BY_AUTHOR:
                    countBookByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void changeBookAuthor() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        Book book = bookStorage.searchByTitle(title);

        if (book != null) {
            System.out.println("please input new author email");
            String email = scanner.nextLine();
            Author author = authorStorage.getByEmail(email);
            book.setAuthor(author);
            System.out.println("Book was changed");
            System.out.println();
        } else {
            System.out.println("Invalid title");
            changeBookAuthor();
        }
    }

    private static void countBookByAuthor() {
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        bookStorage.countBookByAuthor(email);
        System.out.println(bookStorage.countBookByAuthor(email));
    }

    private static void searchBookByAuthor() {
        System.out.println("Please input author email: ");
        String email = scanner.nextLine();
        bookStorage.searchBookByAuthor(email);
    }

    private static void searchByTitle() {
        System.out.println("Please input the title: ");
        String title = scanner.nextLine();
        bookStorage.searchByTitle(title);
    }

    private static void changeAuthor() {
        System.out.println("Please input author email: ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);

        if (author != null) {
            System.out.println("please input author name: ");
            String name = scanner.nextLine();
            author.setName(name);
            System.out.println("Please input author surname: ");
            String surname = scanner.nextLine();
            author.setSurname(surname);
            System.out.println("Please input author age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setAge(age);
            System.out.println("Please input author gender");
            String gender = scanner.nextLine();
            author.setGender(gender);


            System.out.println("Author was changed");
            System.out.println();
        } else {
            System.out.println("Invalid email , please try again: ");
            changeAuthor();
        }


    }


    private static void addBook() {
        System.out.println("Please choose Author email: ");
        System.out.println("---------------------------------");
        authorStorage.print();
        System.out.println("----------------------------------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("Please input book`s title: ");
            String title = scanner.nextLine();
            System.out.println("Please input book`s description: ");
            String description = scanner.nextLine();
            System.out.println("Please input book`s price: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input book`s count: ");
            int count = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, description, price, count, author);
            bookStorage.add(book);
            System.out.println("Book was added");
            System.out.println();
        } else {
            System.out.println("Invalid email , please try again: ");
            addBook();
        }

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
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("Please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for search books by title");
        System.out.println("Please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("Please input " + PRINT_BOOKS + " for print books");
        System.out.println("Please input " + SEARCH_BOOKS_BY_AUTHOR + " for print books by authors: ");
        System.out.println("Please input " + COUNTS_BOOKS_BY_AUTHOR + " for print count of books ");
        System.out.println("Please input " + CHANGE_AUTHOR + " for change author  ");
        System.out.println("Please input " + CHANGE_BOOK_AUTHOR + " for change book  ");
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
        System.out.println();
    }


}