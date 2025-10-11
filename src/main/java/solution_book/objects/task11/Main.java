package solution_book.objects.task11;

public class Main {
    //Класс Ticket
    // Поля: event, row, seatNumber. Два билета равны,
    // если совпадают все три поля. Переопредели equals() и hashCode().

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Film", 5, 17);
        Ticket ticket2 = new Ticket("Film", 5, 17);
        Ticket ticket3 = new Ticket("Theater", 15, 27);

        ticket1.equals(ticket2);
        ticket1.equals(ticket3);

        ticket1.hashCode();
        ticket2.hashCode();
        ticket3.hashCode();

        System.out.println(ticket1.equals(ticket2));
        System.out.println(ticket1.equals(ticket3));

        System.out.println( ticket1.hashCode());
        System.out.println( ticket2.hashCode());
        System.out.println(ticket3.hashCode());

        System.out.println(ticket1.toString());
        System.out.println(ticket2.toString());
        System.out.println(ticket3.toString());

    }
}
