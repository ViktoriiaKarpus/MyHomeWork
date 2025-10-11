package solution_book.objects.task22;

import java.util.HashSet;
import java.util.Set;

public class Main {

    //Класс LibraryBook
    // Поля: isbn, title, author. Равенство — по isbn.
    // toString() — краткое описание книги.

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("745-852-614", "Effective Java", "Joshua Bloch");
        LibraryBook book2 = new LibraryBook("745-852-614", "Effective Java", "Joshua Bloch");
        LibraryBook book3 = new LibraryBook("123-745-98 " , "Head First Java", "Bert Bates");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("book1 equals book2 :" +  book1.equals(book2));
        System.out.println("book2 equals book3 :" +  book2.equals(book3));
        System.out.println("book3 equals book1 :" +  book3.equals(book1));

        Set<LibraryBook> libraryBooks = new HashSet<>();
        libraryBooks.add(book1);
        libraryBooks.add(book2);
        libraryBooks.add(book3);

        System.out.println("Books in the library : ");
        for (LibraryBook b: libraryBooks){
            System.out.println(b);
        }
    }
}
