package solution_book.objects.task1;

public class Main {
    //Класс Book
    // Создай класс с полями title, author, year.
    // Переопредели toString() так, чтобы возвращалась строка: "Книга: <title> (<year>), автор — <author>".
    public static void main(String[] args) {
        Book book = new Book("War and Peace", "Tolstoy", 1863);

        System.out.println(book);
    }
}
