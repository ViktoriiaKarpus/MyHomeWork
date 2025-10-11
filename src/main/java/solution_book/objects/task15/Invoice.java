package solution_book.objects.task15;

import java.util.Objects;

public class Invoice implements Comparable<Invoice> {

    //Класс Invoice
    // Поля: invoiceId, date, amount. Сравнение по дате. Равенство — по invoiceId

    private String invoiceId;
    private String date;
    private int amount;

    public Invoice(String invoiceId, String date, int amount) {
        this.invoiceId = invoiceId;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public int compareTo(Invoice other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Invoice that = (Invoice) obj;
        return this.invoiceId.equals(that.invoiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(invoiceId);
    }

    @Override
    public String toString(){
        return invoiceId + " | " + date + " | $" + amount;

    }
}
