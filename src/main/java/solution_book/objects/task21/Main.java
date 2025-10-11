package solution_book.objects.task21;

import java.util.HashSet;
import java.util.Set;

public class Main {

    //Класс Passport
    // Поля: series, number. Два паспорта равны, если совпадают оба поля.

    public static void main(String[] args) {

        Passport p1 = new Passport("AB", 1234567);
        Passport p2 = new Passport("AB", 1234567);
        Passport p3 = new Passport("BC", 1234777);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p2 equals p3: " + p2.equals(p3));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println("p1.hashCode()  == p2.hashCode() :" + (p1.hashCode() == p2.hashCode()));
        System.out.println("p1.hashCode()  == p3.hashCode() :" + (p1.hashCode() == p3.hashCode()));
        System.out.println("p2.hashCode()  == p3.hashCode() :" + (p2.hashCode() == p3.hashCode()));

        Set<Passport> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println("HashSet size: " + set.size());
    }
}
