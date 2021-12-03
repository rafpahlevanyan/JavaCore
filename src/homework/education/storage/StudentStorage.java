package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.util.Array;

public class StudentStorage {

    private Student[] students = new Student[20];
    private int size;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length * 2];
        System.arraycopy(students, 0, tmp, 0, size);
        students = tmp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void searchByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson)) {
                System.out.println(students[i]);
            }
        }
    }

    public void deleteStudentByEmail(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(student)) {
                Array.deleteByIndex(students, i, size);
            }
            size--;
            return;
        }
    }

}
