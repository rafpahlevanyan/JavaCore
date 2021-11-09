package classwork1;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Rafik", "Pahlevanyan", 24, "+37477787573", "Java Core");
        System.out.println(student.getName());
        // student.setName("name");
        System.out.println(student.getName());
        System.out.println(student);
    }
}
