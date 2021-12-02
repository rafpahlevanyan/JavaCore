package homework.education;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.util.Date;

import java.text.ParseException;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands {

    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();


    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            LessonStudentCommands.printCommands();
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
                default:
                    System.err.println("invalid command");
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

    private static void addStudent() throws ParseException {
        printLessonsList();
        if (lessonStorage.isEmpty()) {
            String lessonName = scanner.nextLine();
            Lesson lesson = lessonStorage.getByLessonName(lessonName);
            if (lesson != null) {
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
                    java.util.Date date = Date.stringToDate(scanner.nextLine());

                    Student student = new Student(name, surname, age, email, phoneNumber, date,lesson);

                    studentStorage.add(student);
                    System.out.println("Student was added");
                    System.out.println();
                } else {
                    System.err.println("Student with this email: " + email + " is exists");
                }

            } else {
                System.err.println("invalid lesson name , try again");
                addStudent();
            }
        } else {
            addLesson();
            addStudent();
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
}