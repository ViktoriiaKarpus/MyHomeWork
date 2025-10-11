package solution_book.objects.task18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //Класс Rectangle
    // Поля: width, height.
    // Сравни прямоугольники по площади (в compareTo()), toString() возвращает "10x20".

    public static void main(String[] args) {

        List<Rectangle> list = List.of(
                new Rectangle(10, 20),
                new Rectangle(5,10),
                new Rectangle(8,8)
        );

        List<Rectangle> sorted = new ArrayList<>(list);
        Collections.sort(sorted);

        System.out.println(sorted);
    }
}
