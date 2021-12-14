package homework.education;

import homework.education.exception.UserNotFoundException;
import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;
import homework.education.util.Date;

import java.text.ParseException;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            LessonStudentCommands.printCommands();
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

    private static void isUser() {
        boolean isRun = true;
        while (isRun) {
            LessonStudentCommands.printCommandsUser();
            String command = scanner.nextLine();


            switch (command) {
                case LOG_OUT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENT:
                    studentStorage.print();
                    break;
                case SEARCH_STUDENT_BY_LESSON:
                    searchStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.err.println("invalid command");

            }
        }
    }

    private static void isAdmin() {
        boolean isRun = true;
        while (isRun) {
            LessonStudentCommands.printCommandsAdmin();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENT:
                    studentStorage.print();
                    break;
                case SEARCH_STUDENT_BY_LESSON:
                    searchStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSONS_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENTS_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                case CHANGE_LESSON:
                    changeLesson();
                    break;
                default:
                    System.err.println("invalid command");
            }
        }
    }


    private static void login() {
        System.out.println("Please enter your email");
        String email = scanner.nextLine();
        User byEmail = null;
        try {
            byEmail = userStorage.getByEmail(email);
            System.out.println("Please input password");
            String password = scanner.nextLine();
            if (byEmail.getPassword().equals(password)) {
                if (byEmail.getType().equalsIgnoreCase("admin")) {
                    isAdmin();
                } else if (byEmail.getType().equalsIgnoreCase("user")) {
                    isUser();
                }
            } else {
                System.err.println("Password is wrong");
            }
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void register() {
        System.out.println("Please enter your email");
        String email = scanner.nextLine();
        try {
            userStorage.getByEmail(email);
            System.err.println("User does not exists");
        } catch (UserNotFoundException e) {

            System.out.println("Please enter your password");
            String password = scanner.nextLine();
            System.out.println("Please enter your name");
            String name = scanner.nextLine();
            System.out.println("Please enter your surname");
            String surname = scanner.nextLine();
            System.out.println("Please enter user type");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("user")) {
                userStorage.add(new User(name, surname, email, password, type));
                System.out.println("You are registered");
            } else {
                System.err.println("Type is invalid");

            }
        }
    }


    private static void deleteStudentByEmail() {
        System.out.println("please choose student");
        System.out.println("----------------------------");
        studentStorage.print();
        System.out.println("----------------------------");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);

        if (student != null) {
            studentStorage.deleteStudentByEmail(student);
        } else {
            System.err.println("Student does not exists");
        }
    }


    private static void deleteLessonByName() {
        System.out.println("Please choose lesson");
        System.out.println("-----------");
        lessonStorage.print();
        System.out.println("-----------");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null) {
            lessonStorage.deleteLessonByName(lesson);
            System.out.println("Lesson was deleted");
        } else {
            System.err.println("Lesson does not exists");
        }
    }

    private static void printLessonsList() {
        System.out.println("Please choose lesson name");
        System.out.println("--------------------------");
        lessonStorage.print();
        System.out.println("--------------------------");
    }

    private static void addStudent() {
        printLessonsList();
        if (lessonStorage.isEmpty()) {
            String lessonNamesString = scanner.nextLine();
            String[] lessonNames = lessonNamesString.split(",");
            if (lessonNames.length == 0) {
                System.err.println("Please choose lessons");
                return;
            }
            Lesson[] lessons = new Lesson[lessonNames.length];
            int foundLessons = 0;
            for (String lessonName : lessonNames) {
                Lesson lesson = lessonStorage.getByLessonName(lessonName);
                if (lesson != null) {
                    lessons[foundLessons++] = lesson;

                } else {
                    System.err.println("PLease input correct lesson name");
                    return;
                }
            }

            System.out.println("Please input student email ");
            String email = scanner.nextLine();
            if (studentStorage.getByEmail(email) == null) {
                System.out.println("Please input student name ");
                String name = scanner.nextLine();
                System.out.println("PLease input student surname");
                String surname = scanner.nextLine();
                System.out.println("please input student age");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("please input student phone number");
                String phoneNumber = scanner.nextLine();
                System.out.println("please input student date of birth  'dd.mm.yyyy'    ");
                java.util.Date date = null;
                try {
                    date = Date.stringToDate(scanner.nextLine());
                } catch (ParseException e) {
                    System.out.println("Invalid date format, please input this format 'dd,mm,yyyy' ");
                    return;
                }

                Student student = new Student(name, surname, age, email, phoneNumber, date, lessons);

                studentStorage.add(student);
                System.out.println("Student was added");
                System.out.println();
            } else {
                System.err.println("Student with this email: " + email + " is exists");
            }
        }
    }


    private static void addLesson() {
        System.out.println("PLease input lesson name, duration, lecturer name, price");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonData.length == 4) {
            int duration = Integer.parseInt(lessonData[1]);
            int price = Integer.parseInt(lessonData[3]);
            Lesson lesson = new Lesson(lessonData[0], duration, lessonData[2], price);
            if (lessonStorage.getByLessonName(lesson.getLessonName()) != null) {
                System.err.println("Lesson with this name is already exists");
            } else {
                lessonStorage.add(lesson);
                System.out.println("Lesson was added");
                System.out.println();
            }
        } else {
            System.err.println("invalid data");
        }
    }

    private static void searchStudentsByLesson() {
        printLessonsList();
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null) {
            studentStorage.searchByLesson(lesson);
        } else {
            System.err.println("lesson does not exists");
        }
    }

    private static void changeLesson() {
        System.out.println("PLease choose student email");
        System.out.println("------------");
        studentStorage.print();
        System.out.println("------------");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            printLessonsList();
            String lessonName = scanner.nextLine();
            String[] lessonArray = lessonName.split(",");
            if (lessonArray.length == 0) {
                System.err.println("Please choose lesson");
                return;
            }
            Lesson[] lessons = new Lesson[lessonArray.length];
            int size = 0;
            for (String lessonName1 : lessonArray) {
                Lesson lesson1 = lessonStorage.getByLessonName(lessonName1);
                if (lesson1 != null) {
                    lessons[size++] = lesson1;
                } else {
                    System.err.println("Please input correct lesson");
                    return;
                }
            }

            student.setLesson(lessons);
            System.out.println("Lessons was changed");
        } else {
            System.err.println("Student does not exists");
            System.out.println();
        }
    }
}