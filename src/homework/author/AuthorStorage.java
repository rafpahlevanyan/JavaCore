package homework.author;

public class AuthorStorage {

    private Author[] array;
    private int size = 0;

    AuthorStorage() {
        array = new Author[10];
    }

    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[array.length + (array.length / 2)];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }


    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index: " + index);
            return null;
        }
        return array[index];
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword) || array[i].getSurname().contains(keyword)) {
                System.out.println(array[i]);

            }

        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAge() > minAge && array[i].getAge() < maxAge) {
                System.out.println(array[i]);
            }
        }

    }
}

