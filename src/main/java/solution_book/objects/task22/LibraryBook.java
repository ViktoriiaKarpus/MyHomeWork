package solution_book.objects.task22;

import java.util.Objects;

public class LibraryBook {

    //Класс LibraryBook
    // Поля: isbn, title, author. Равенство — по isbn. toString() — краткое описание книги.

    private String isbn;
    private String title;
    private String author;

    public LibraryBook(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryBook that = (LibraryBook) o;
        return this.isbn.equals(that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
