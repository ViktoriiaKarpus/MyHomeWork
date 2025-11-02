package solution_book_stream_api.task14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    //Сортировка объектов по полю
    // Отсортируй список Product по цене по возрастанию.

    public static void main(String[] args) {
        Product p1 = new Product("Milk", 12.33);
        Product p2 = new Product("Sugar", 1.12);
        Product p3 = new Product("Eggs", 2.30);
        Product p4 = new Product("Nutella", 4.25);
        Product p5 = new Product("Apple", 10.33);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        System.out.println(products);

        products.sort(Comparator.comparingDouble(Product::getPrice));

        System.out.println("Before sort: ");
        System.out.println(products);

    }
}
