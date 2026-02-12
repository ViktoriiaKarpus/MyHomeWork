package hw_pattern_complex_tasks.task3;

public class RealBook extends Book implements BookContent {

    private final String content;

    public RealBook(Book.BookBuilder builder, String content) {
        super(builder);
        this.content = content;
    }

    @Override
    public String getContent() {
        System.out.println("Loading book content...");
        return content;
    }
}
