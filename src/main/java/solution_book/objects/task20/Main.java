package solution_book.objects.task20;

public class Main {

    //Класс Position
    // Поля: x, y. equals() и hashCode() — по координатам.
    // toString() должен возвращать формат "(x=5, y=7)".
    public static void main(String[] args) {

        Position p1 = new Position(5.0, 7.0);
        Position p2 = new Position(5.0, 7.0);
        Position p3 = new Position(2.0, 3.0);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("p1 equals p2 ? " + p1.equals(p2));
        System.out.println("p1 equals p3 ? " + p1.equals(p3));
        System.out.println("p2 equals p3 ? " + p2.equals(p3));

        System.out.println("p1.hashCode(): " +p1.hashCode());
        System.out.println("p2.hashCode(): " +p2.hashCode());
        System.out.println("p3.hashCode(): " +p3.hashCode());

    }
}
