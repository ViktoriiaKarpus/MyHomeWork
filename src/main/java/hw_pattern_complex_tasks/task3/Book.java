package hw_pattern_complex_tasks.task3;

public class Book implements BookInterface {

    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.year = builder.year;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public String getTitle() {
        return title;
    }


    static class BookBuilder {
        private String title;
        private String author;
        private String year;

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getYear() {
            return year;
        }


        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setYear(String year) {
            this.year = year;
            return this;
        }

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }


}
