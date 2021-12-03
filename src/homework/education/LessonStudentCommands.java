package homework.education;

public interface LessonStudentCommands {

     String EXIT = "0";
     String ADD_LESSON = "1";
     String ADD_STUDENT = "2";
     String PRINT_STUDENT = "3";
     String SEARCH_STUDENT_BY_LESSON = "4";
     String PRINT_LESSONS = "5";
     String DELETE_LESSONS_BY_NAME = "6";
     String DELETE_STUDENTS_BY_EMAIL = "7";
     String CHANGE_LESSON = "8";


     static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_LESSON + " for add lesson ");
        System.out.println("Please input " + ADD_STUDENT + " for add student ");
        System.out.println("Please input " + PRINT_STUDENT + " for print student ");
        System.out.println("Please input " + SEARCH_STUDENT_BY_LESSON + " for search student by lesson ");
        System.out.println("Please input " + PRINT_LESSONS + " for print lesson ");
        System.out.println("Please input " + DELETE_LESSONS_BY_NAME + " for delete lessons by name ");
        System.out.println("Please input " + DELETE_STUDENTS_BY_EMAIL + " for delete students by email ");
        System.out.println("Please input " + CHANGE_LESSON + " for change lesson ");
    }
}
