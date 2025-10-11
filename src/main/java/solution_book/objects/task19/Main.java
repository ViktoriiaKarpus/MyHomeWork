package solution_book.objects.task19;

public class Main {

    //Класс Message
    // Поля: from, to, timestamp, content. Сравнение по времени, equals() — по timestamp и from.

    public static void main(String[] args) {

        Message message1 = new Message("Moday", "Wednesday", 12, "Send your report");
        Message message2 = new Message("Moday", "Wednesday", 12, "Send your report");
        Message message3 = new Message("Moday", "Wednesday", 15, "Send your report");

        System.out.println(message1.compareTo(message2));
        System.out.println(message1.compareTo(message3));
        System.out.println(message2.compareTo(message3));

        System.out.println(message1.equals(message2));
        System.out.println(message1.equals(message3));
        System.out.println(message2.equals(message3));

        System.out.println("message1.hashCode() : " + message1.hashCode());
        System.out.println("message2.hashCode() : " + message2.hashCode());
        System.out.println("message3.hashCode(): " + message3.hashCode());
    }
}
