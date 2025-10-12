package solution_book.objects.task30;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //Класс ProductCode
    // Поле: code. Два кода равны, если совпадают первые 8 символов.
    // hashCode() тоже должен учитывать только первые 8.

    public static void main(String[] args) {
        ProductCode p1 = new ProductCode("123456789");
        ProductCode p2 = new ProductCode("ASFHJOOKNV123458");
        ProductCode p3 = new ProductCode("ASFHJOOKNV123458");
        ProductCode p4 = new ProductCode("SHORT");

        System.out.println("p1 equals p2? :" + p1.equals(p2));
        System.out.println("p1 equals p3? :" + p1.equals(p3));
        System.out.println("p1 equals p4? :" + p1.equals(p4));
        System.out.println("p3 equals p2? :" + p3.equals(p2));
        System.out.println("p2 equals p4? :" + p2.equals(p4));
        System.out.println("p4 equals p3? :" + p4.equals(p3));

        Set<ProductCode> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (ProductCode p : set) {
            System.out.println(p);
        }
    }
}
