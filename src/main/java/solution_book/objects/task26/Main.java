package solution_book.objects.task26;

public class Main {
    //Класс PhoneNumber
    // Поля: countryCode, number. Равенство — по обоим полям.
    // Нормализуй номер при сравнении (+7 и 007 считаются равными).

    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber("+7", "012-345-678");
        PhoneNumber p2 = new PhoneNumber("007", "(012)345678");
        PhoneNumber p3 = new PhoneNumber("7", "012345678");

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        System.out.println(p1.hashCode()==p2.hashCode());

    }
}
