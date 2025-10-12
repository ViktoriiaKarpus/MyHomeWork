package solution_book.objects.task27;

public class Main {
    //Класс Client
    // Поля: fullName, clientCode.
    // Равенство — по коду.
    // toString() — просто имя.

    public static void main(String[] args) {

        Client client1 = new Client("Inna Johnson", 123456789);
        Client client2 = new Client("Ivan Leff", 123444789);
        Client client3 = new Client("Pret Kales", 123456789);
        Client client4 = new Client("Ian Tess", 123456789);

        System.out.println("client1 equals client2 ? : " + client1.equals(client2));
        System.out.println("client3 equals client2 ? : " + client3.equals(client2));
        System.out.println("client1 equals client4 ? : " + client1.equals(client4));
        System.out.println("client4 equals client3 ? : " + client4.equals(client3));
    }
}
