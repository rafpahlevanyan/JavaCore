package homework.education;

import homework.arrayutil.ArrayUtil;

public class LessonStorage {

    private Lesson[] lessons = new Lesson[20];
    private int size;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length * 2];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public Lesson getByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().equals(lessonName)) {
                return lessons[i];
            }
        }
        return null;
    }


    public void deleteLessonByName(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().equals(lesson)) {
                for (int j = i + 1; j < size; j++) {
                    lessons[j - 1] = lessons[j];
                }
            }
            size--;
            return;
        }
    }

    public boolean checkLessonExists() {
        for (int i = 0; i < size; i++) {
            if (lessons[i] != null) {
                return true;
            }

        }
        return false;
    }

}
