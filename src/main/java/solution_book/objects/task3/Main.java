package solution_book.objects.task3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //Класс Point2D
    // Поля x, y. Если x и y равны, точки считаются равными. Проверь поведение в коллекциях (HashSet).
    public static void main(String[] args) {

        Point2D p1 = new Point2D("A", "1");
        Point2D p2 = new Point2D("A", "1");
        Point2D p3 = new Point2D("B", "3");

        Set<Point2D> points = new HashSet<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);

        System.out.println("The amount of the points in HashSet are :" + points.size());

        for (Point2D p: points){
            System.out.println(p);
        }

    }
}
