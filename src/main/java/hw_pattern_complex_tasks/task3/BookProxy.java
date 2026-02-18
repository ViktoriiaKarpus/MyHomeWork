package hw_pattern_complex_tasks.task3;

public class BookProxy implements BookInterface, BookContent {

    private final Book book;
    private RealBook realBook;
    private final String contentPath;

    public BookProxy(Book book, String contentPath) {
        this.book = book;
        this.contentPath = contentPath;
    }

    private void loadContent() {
        if (realBook == null) {
            System.out.println("Lazy loading book content from: " + contentPath);
            String loadedContent =
                    "This is the content of the book: " + book.getTitle();

            realBook = new RealBook(book, loadedContent);
        }
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
        loadContent();
        return realBook.getContent();
    }
}
