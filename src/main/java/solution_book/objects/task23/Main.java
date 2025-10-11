package solution_book.objects.task23;

public class Main {

    //Класс Flight
    // Поля: flightNumber, departureTime. Сравни по времени вылета, equals() — по номеру рейса

    public static void main(String[] args) {
        Flight f1 = new Flight(12345, 12.53);
        Flight f2 = new Flight(12345, 12.53);
        Flight f3 = new Flight(127775, 12.43);

        System.out.println("f1 compareTo f2 : " + f1.compareTo(f2));
        System.out.println("f2 compareTo f3 : " + f2.compareTo(f3));
        System.out.println("f1 compareTo f3 : " + f1.compareTo(f3));

        System.out.println("f1 equals f2 : " + f1.equals(f2));
        System.out.println("f2 equals f3 : " + f2.equals(f3));
        System.out.println("f1 equals f3 : " + f1.equals(f3));

        System.out.println("f1 hashCode : " +f1.hashCode());
        System.out.println("f2 hashCode : " +f2.hashCode());
        System.out.println("f3 hashCode : " +f3.hashCode());
    }
}
