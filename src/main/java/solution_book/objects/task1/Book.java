package solution_book.objects.task1;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override

    public String toString(){
        return "Book: " + this.title + " (" + this.year + ") , author - " + this.author;
    }
}


