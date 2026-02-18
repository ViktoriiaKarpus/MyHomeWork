package hw_pattern_complex_tasks.task3;

public class RealBook implements BookInterface, BookContent {

    private final Book book;
    private final String content;

    public RealBook(Book book, String content) {
        this.book = book;
        this.content = content;
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getAuthor() {
        return book.getAuthor();
    }

    @Override
    public String getYear() {
        return book.getYear();
    }

    @Override
    public String getContent() {
        System.out.println("Loading book content...");
        return content;
    }
}
