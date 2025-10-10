package solution_book.objects.task10;

import java.util.Objects;

public class EmailAddress {
    //Класс EmailAddress
    //Поле: address. Два адреса равны, если совпадают по email без учёта регистра.
    //Переопредели equals(), hashCode() и протестируй в HashSet.


    private String address;

    public EmailAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailAddress that)) return false;
        return address.equalsIgnoreCase(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address.toLowerCase());
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
