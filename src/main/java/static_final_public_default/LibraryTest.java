package static_final_public_default;

public class LibraryTest {

    public static void main(String[] args) {
        Library library = new Library("Beauty", "Viki", 2025, "Romantic story");
        System.out.println("Book title: " + library.getBookTitle());
        System.out.println("Author: " + library.author);
        System.out.println("Year: " + library.year);
        System.out.println("Category: " + library.category);
    }
}
