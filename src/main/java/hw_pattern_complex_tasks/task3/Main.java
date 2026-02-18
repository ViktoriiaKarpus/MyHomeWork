package hw_pattern_complex_tasks.task3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder()
                .setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setYear("1869")
                .build();

        BookProxy proxyBook =
                new BookProxy(book, "/books/book/war_and_peace.txt");

        System.out.println("Title: " + proxyBook.getTitle());
        System.out.println("Author: " + proxyBook.getAuthor());
        System.out.println("Year: " + proxyBook.getYear());

        System.out.println("Content: " + proxyBook.getContent());
        System.out.println("Content: " + proxyBook.getContent()); // no reload
    }
}

