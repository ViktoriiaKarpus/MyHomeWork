package solution_book.objects.task13;

public class Main {

    //Класс Contact
    // Поля: name, phone. Переопредели equals(), чтобы сравнение шло только по телефону.
    // toString() возвращает имя и номер.

    public static void main(String[] args) {

        Contact contact1 = new Contact("Inna", "0231456789");
        Contact contact2 = new Contact("Inna", "0231456789");
        Contact contact3 = new Contact("Sten", "0221456789");

        contact1.equals(contact2);
        contact1.equals(contact3);
        contact2.equals(contact3);

        System.out.println(contact1.equals(contact2));
        System.out.println(contact1.equals(contact3));
        System.out.println(contact2.equals(contact3));
    }
}
