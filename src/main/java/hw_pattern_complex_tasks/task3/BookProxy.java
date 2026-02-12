package hw_pattern_complex_tasks.task3;

public class BookProxy implements BookContent, BookInterface {

    private final Book.BookBuilder builder;
    private RealBook realBook;
    private final String contentPath;


    public BookProxy(Book.BookBuilder builder, String contentPath) {
        this.builder = builder;
        this.contentPath = contentPath;
    }

    private void loadContent() {
        if (realBook == null) {
            System.out.println("lazy loading book content from: " + contentPath);
            String loadedContent =
                    "This is the content of the book : " + builder.getTitle();
            realBook = new RealBook(builder, loadedContent);
        }
    }

    @Override
    public String getContent() {
        loadContent();

        return realBook.getContent();
    }

    @Override
    public String getTitle() {
        return builder.getTitle();
    }

    @Override
    public String getAuthor() {
        return builder.getAuthor();
    }

    @Override
    public String getYear() {
        return builder.getYear();
    }
}
