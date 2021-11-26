package homework.author_book;

public class AuthorStorage {

    private Author[] authors;
    private int size = 0;

    AuthorStorage() {
        authors = new Author[20];
    }

    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        boolean IsFound = false;
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(author.getEmail())) {
                IsFound = true;
                break;
            }
        }

        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + (authors.length / 2)];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }


    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index: " + index);
            return null;
        }
        return authors[index];
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i] + " ");
        }
        System.out.println();
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) || authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);

            }

        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() > minAge && authors[i].getAge() < maxAge) {
                System.out.println(authors[i]);
            }
        }

    }


    public Author getByEmail(String email) {

        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)){
                return authors[i];
            }
        }
        return null;
    }

    public void deleteAuthor(String email){
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)){
                for (int j = i+1; j <size ; j++) {
                    authors[j-1] = authors[j];
                }
            }
            size--;
            break;
        }

    }


}

