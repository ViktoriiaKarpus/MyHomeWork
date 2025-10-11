package solution_book.objects.task15;

import java.util.HashSet;
import java.util.Set;

public class Main {

    //Класс Invoice
    // Поля: invoiceId, date, amount. Сравнение по дате. Равенство — по invoiceId

    public static void main(String[] args) {

        Set<Invoice> set = new HashSet<>();
        set.add(new Invoice("A1", "2024-02-25", 100));
        set.add(new Invoice("A1", "2024-02-25", 200));
        set.add(new Invoice("B2", "2024-03-10", 150));

        System.out.println(set);
    }
}
