package solution_book.objects.task11;

import java.util.Objects;

public class Ticket {

    //Класс Ticket
    // Поля: event, row, seatNumber. Два билета равны,
    // если совпадают все три поля. Переопредели equals() и hashCode().

    private String event;
    private int row;
    private int seatNumber;

    public Ticket(String event, int row, int seatNumber) {
        this.event = event;
        this.row = row;
        this.seatNumber = seatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return row == ticket.row && seatNumber == ticket.seatNumber && Objects.equals(event, ticket.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, row, seatNumber);
    }

    @Override
    public String toString() {
        return "event='" + event + '\'' +
                ", row=" + row +
                ", seatNumber=" + seatNumber;
    }

}
