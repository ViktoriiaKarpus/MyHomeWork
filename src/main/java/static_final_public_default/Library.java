package static_final_public_default;

public class Library {
    /**
     * Создайте класс Library с полями:
     * private String bookTitle
     * protected String author
     * int year (default-доступ)
     * public String category.
     * Реализуйте геттеры и сеттеры для всех полей.
     * В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.
     */

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public Library(String bookTitle, String author, int year, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public void setBookTitle(String newBookTitle) {
        bookTitle = newBookTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }


    public void setYear(int newYear) {
        year = newYear;
    }

    public void setCategory(String newCategory) {
      category = newCategory;
    }
}
