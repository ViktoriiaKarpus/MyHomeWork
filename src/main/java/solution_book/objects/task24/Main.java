package solution_book.objects.task24;

import java.util.HashSet;
import java.util.Set;

public class Main {

    //Класс GeoPoint
    // Поля: latitude, longitude.
    // equals() и hashCode() — с учётом округления до 4 знаков.

    public static void main(String[] args) {
        GeoPoint p1 = new GeoPoint(50.1234567, 30.987456213);
        GeoPoint p2 = new GeoPoint(50.1234567, 30.987456213);
        GeoPoint p3 = new GeoPoint(50.1231167, 33.987456213);

        System.out.println("Points : ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("p1 equals p2 ? : " + p1.equals(p2));
        System.out.println("p1 equals p3 ? : " + p1.equals(p3));
        System.out.println("p3 equals p2 ? : " + p3.equals(p2));

        Set<GeoPoint> points = new HashSet<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);

        System.out.println(" Points in HashSet : ");
        for(GeoPoint p : points){
            System.out.println(p);
        }


    }
}
