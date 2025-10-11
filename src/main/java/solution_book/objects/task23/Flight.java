package solution_book.objects.task23;

import java.util.Objects;

public class Flight implements Comparable<Flight> {
    //Класс Flight
    // Поля: flightNumber, departureTime. Сравни по времени вылета, equals() — по номеру рейса

    private int flightNumber;
    private Double departureTime;

    public Flight(int flightNumber, Double departureTime) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
    }

    @Override
    public int compareTo(Flight o) {
        return Double.compare(this.departureTime, o.departureTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", departureTime=" + departureTime +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber);
    }


}
