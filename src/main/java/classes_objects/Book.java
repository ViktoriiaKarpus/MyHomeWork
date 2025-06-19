package classes_objects;

public class Book {
    /**
     * Создайте класс Book с полями title и author.
     * Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
     * выводящий название и автора книги.
     * В main создайте книгу, измените автора и выведите информации
     */

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void printInfo(){
        System.out.println("Title: " + title + "Author: " + author);
    }
}
