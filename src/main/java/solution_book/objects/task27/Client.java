package solution_book.objects.task27;

import java.util.Objects;

public class Client {
    //Класс Client
    // Поля: fullName, clientCode.
    // Равенство — по коду.
    // toString() — просто имя.

    private String fullName;
    private int clientCode;

    public Client(String fullName, int clientCode) {
        this.fullName = fullName;
        this.clientCode = clientCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientCode == client.clientCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clientCode);
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
