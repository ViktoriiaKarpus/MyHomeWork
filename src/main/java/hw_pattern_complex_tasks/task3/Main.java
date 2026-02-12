package hw_pattern_complex_tasks.task3;

public class Main {
    public static void main(String[] args) {
        Book.BookBuilder builder = new Book.BookBuilder()
                .setTitle("war and Peace")
                .setAuthor("Leo Tolstoy")
                .setYear("1869");

        BookProxy proxyBook = new BookProxy(builder, "/books/book/war_and_peace.txt");
        System.out.println("Title: " + proxyBook.getTitle());
        System.out.println("Author: " + proxyBook.getAuthor());
        System.out.println("Year: " + proxyBook.getYear());

        System.out.println("Content: " + proxyBook.getContent());
        System.out.println("Content: " + proxyBook.getContent()); // check for: Reupload is not happening
    }
}
