package solution_book.objects.task2;

public class Main {
    //Класс User
    // Поля: id, name, email.
    // Сравнение пользователей должно происходить по id. Переопредели equals() и hashCode().
    public static void main(String[] args) {
        User user1 = new User(123456789, "Viki", "viki@example.com");
        User user2 = new User(123456789, "Viki", "viki@example.com");
        User user3 = new User(123456779, "Steve", "steave@example.com");

        System.out.println("u1.equals(u2): " + user1.equals(user2) );
        System.out.println("u1.equals(u3): " + user1.equals(user3) );

        System.out.println("u1.hashCode(): " + user1.hashCode());
        System.out.println("u2.hashCode(): " + user2.hashCode());
        System.out.println("u3.hashCode(): " + user3.hashCode());

    }
}
