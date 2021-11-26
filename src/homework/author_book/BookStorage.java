package homework.author_book;

public class BookStorage {
    private Book[] books = new Book[20];
    private int size;

    public void add(Book book) {
        if (books.length == size) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + (books.length / 2)];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i] + " ");
        }
        System.out.println();
    }

    public Book searchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void searchBookByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);
            }
        }
    }

    public int countBookByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                count++;
            }
        }
        return count;
    }

    public Book changeBookAuthor(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteByAuthor(String email) {
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null && books[i].getAuthor().getEmail().equals(email)) {
                for (int j = i + 1; j < size; j++) {
                    books[j - 1] = books[j];

                }
            }
            size--;
        }
    }

    public void deleteBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                for (int j = i + 1; j < size; j++) {
                    books[j - 1] = books[j];
                }
            }
            size--;
            return;
        }
    }
}