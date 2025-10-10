package solution_book.objects.task6;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Milk", 12.34);
        Product product2 = new Product("Milk", 12.34);
        Product product3 = new Product("Water", 12.34);

        product1.equals(product2);
        product1.equals(product3);

        System.out.println( product1.equals(product2));
        System.out.println(product1.equals(product3));

        System.out.println(product1);
        System.out.println(product3);
    }
}
