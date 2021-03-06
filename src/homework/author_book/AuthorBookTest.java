package homework.author_book;


import homework.author_book.exceptions.BookNotFoundException;
import homework.author_book.model.*;
import homework.author_book.storage.AuthorStorage;
import homework.author_book.storage.BookStorage;
import homework.author_book.storage.UserStorage;
import homework.author_book.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {

        initData();
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printCommands();
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
                    System.out.println("Invalid command!");

            }
        }
    }

    private static void login() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User byEmail = userStorage.getByEmail(email);
        if (byEmail != null) {
            System.out.println("please input password");
            String password = scanner.nextLine();
            if (byEmail.getPassword().equals(password)) {
                if (byEmail.getType() == UserType.ADMIN) {
                    adminLogin();
                } else if (byEmail.getType() == UserType.USER) {
                    userLogin();
                }
            } else {
                System.err.println("password is wrong");
            }
        } else {
            System.err.println("User with " + email + " does not exists");
        }
    }

    private static void userLogin() {
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case ADD_TAG_TO_BOOK:
                    addTagToBook();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void register() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User byEmail = userStorage.getByEmail(email);
        if (byEmail == null) {
            System.out.println("Please input name");
            String name = scanner.nextLine();
            System.out.println("Please input surname");
            String surname = scanner.nextLine();
            System.out.println("Please input password");
            String password = scanner.nextLine();
            System.out.println("Please input type 'admin or user ' ");
            try {
                String type = scanner.nextLine();
                User user = new User();
                user.setEmail(email);
                user.setName(name);
                user.setSurname(surname);
                user.setPassword(password);
                user.setType(UserType.valueOf(type.toUpperCase(Locale.ROOT)));
                userStorage.add(user);
                System.out.println("User was registered");


            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());

//            if (type.equalsIgnoreCase("admin") ||
//                    type.equalsIgnoreCase("user")) {

            }
        } else {
            System.err.println("User with " + email + " already exists");
        }
    }


    private static void adminLogin() {
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case DELETE_BOOK_BY_AUTHOR:
                    deleteBookByAuthor();
                    break;
                case ADD_TAG_TO_BOOK:
                    addTagToBook();
                    break;
                case REMOVE_TAGS_FROM_BOOK:
                    removeTagFromBooks();
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        }
    }


    private static void removeTagFromBooks() {
        System.out.println("please choose book by serial id");
        System.out.println("--------");
        bookStorage.print();
        System.out.println("--------");
        String serialId = scanner.nextLine();
        try {
            Book book = bookStorage.getBySerialId(serialId);
            System.out.println("Please input tags separate  ' , ' ");
            String tagsStr = scanner.nextLine();
            String[] tagsToRemove = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                System.err.println("Book does not have tags");
            } else {
                for (String tag : tagsToRemove) {
                    boolean isExist = false;
                    for (String bookTag : bookTags) {
                        if (bookTag.equals(tag)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        System.err.println(tag + " does not exists on book " + book);
                        return;
                    }
                }
                String[] newTags = new String[bookTags.length - tagsToRemove.length];
                int index = 0;
                for (String bookTag : bookTags) {
                    boolean isExist = false;
                    for (String toRemove : tagsToRemove) {
                        if (bookTag.equals(toRemove)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        newTags[index++] = bookTag;
                    }
                }
                book.setTags(newTags);
                System.out.println("Tag(s) was removed");
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addTagToBook() {
        System.out.println("please choose book by serial id");
        System.out.println("--------");
        bookStorage.print();
        System.out.println("--------");
        String serialId = scanner.nextLine();
        try {
            Book book = bookStorage.getBySerialId(serialId);

            System.out.println("Please input tags separate  ' , ' ");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                book.setTags(tags);
                System.out.println("Tags were added");
            } else {
                for (String tag : tags) {
                    for (String bookTag : bookTags) {
                        if (tag.equals(bookTag)) {
                            System.err.println(tag + " is duplicate , Please input new tag`s");
                            return;
                        }
                    }
                }
                String[] newTags = new String[bookTags.length + tags.length];
                System.arraycopy(bookTags, 0, newTags, 0, bookTags.length);
                System.arraycopy(tags, 0, newTags, bookTags.length, tags.length);
                book.setTags(newTags);
                System.out.println("Tags were added");
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void initData() {
        try {
            Author author = new Author("poxos", "poxosyan", "poxos@mail.com",
                    22, Gender.MALE, DateUtil.stringToDate("12.03.2000"));
            authorStorage.add(author);
            Author author1 = new Author("poxosuhi","poxosyan","poxosuhi@mail.ru",52, Gender.FEMALE,
                    DateUtil.stringToDate("23.05.1995"));
      authorStorage.add(author1);
//        authorStorage.add(new Author("petros", "petrosyan", "petros@mail.com", 25, "male"));

            Author[] authors = {author};
            String[] tags = {"tag1", "tag2", "tag3", "tag4"};
            bookStorage.add(new Book("1", "girq", "asd", 5, 2, authors, tags));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void deleteBookByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.deleteByAuthor(author);
        } else {
            System.err.println("Author does not exists");

        }
    }

    private static void deleteBook() {
        System.out.println("please choose book by serial id");
        System.out.println("--------");
        bookStorage.print();
        System.out.println("--------");
        String serialId = scanner.nextLine();
        try {
            Book book = bookStorage.getBySerialId(serialId);
            bookStorage.delete(book);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            authorStorage.delete(author);
        } else {
            System.err.println("Author does not exists");

        }
    }

    private static void printAuthorsList() {
        System.out.println("please choose author's emails separate ' , ' ");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
    }

    private static void changeBookAuthor() {
        System.out.println("please choose book by serial id");
        System.out.println("--------");
        bookStorage.print();
        System.out.println("--------");
        String serialId = scanner.nextLine();
        try {
            Book book = bookStorage.getBySerialId(serialId);
            printAuthorsList();
            String emails = scanner.nextLine();
            String[] emailArray = emails.split(",");
            if (emailArray.length == 0) {
                System.out.println("Please choose authors ");
                return;
            }
            Author[] authors = new Author[emailArray.length];
            int index = 0;
            for (String email : emailArray) {
                Author author = authorStorage.getByEmail(email);
                if (author != null) {
                    authors[index++] = author;
                } else {
                    System.err.println("Please input correct authors email");
                    return;
                }
            }
            book.setAuthors(authors);

        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void changeAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input author's name");
            String name = scanner.nextLine();
            System.out.println("please input author's surname");
            String surname = scanner.nextLine();
            System.out.println("please input author's gender");
            try {
                Gender gender = Gender.valueOf(scanner.nextLine());
                System.out.println("please input author's age");
                int age = Integer.parseInt(scanner.nextLine());
                author.setName(name);
                author.setSurname(surname);
                author.setGender(gender);
                author.setAge(age);
                System.out.println("Author was changed");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());

            }

        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void countBooksByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.countByAuthor(author);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void searchBooksByAuthor() {
        printAuthorsList();
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.searchByAuthor(author);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }

    private static void addBook() {

        printAuthorsList();
        String emails = scanner.nextLine();
        String[] emailArray = emails.split(",");
        if (emailArray.length == 0) {
            System.out.println("Please choose authors ");
            return;
        }
        Author[] authors = new Author[emailArray.length];
        int index = 0;
        for (String email : emailArray) {
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                authors[index++] = author;
            } else {
                System.err.println("Please input correct authors email");
                return;
            }
        }

        System.out.println("please input book's serialId");
        String serialId = scanner.nextLine();
        try {
            bookStorage.getBySerialId(serialId);
            System.err.println("Book is duplicate");

        } catch (BookNotFoundException e) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input book tags`s");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");

            Book book = new Book(serialId, title, desc, price, count, authors, tags);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        }
    }


    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }


    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }


    private static void addAuthor() {
        System.out.println("please input author's name,surname,email,gender,age, date of birth  'dd.mm.yyyy' ");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {
            Date date;
            try {
                date = DateUtil.stringToDate(authorData[5]);
            } catch (ParseException e) {
                System.out.println("Invalid date format, please input this format 'dd,mm,yyyy' ");
                return;
            }
            try {
                int age = Integer.parseInt(authorData[4]);
                Author author = new Author(authorData[0], authorData[1], authorData[2], age,
                        Gender.valueOf(authorData[3].toUpperCase(Locale.ROOT)), date);

                if (authorStorage.getByEmail(author.getEmail()) != null) {
                    System.err.println("Invalid email. Author with this email already exists");
                } else {
                    authorStorage.add(author);
                    System.out.println("Thank you, author was added");
                }
            } catch (IllegalArgumentException exa) {
                System.out.println(exa.getMessage());
            }

        } else {
            System.err.println("invalid data");
        }
    }
}