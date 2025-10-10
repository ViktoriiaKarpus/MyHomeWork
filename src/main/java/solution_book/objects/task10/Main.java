package solution_book.objects.task10;

import java.util.HashSet;

public class Main {

    //Класс EmailAddress
    // Поле: address. Два адреса равны, если совпадают по email без учёта регистра.
    // Переопредели equals(), hashCode() и протестируй в HashSet.

    public static void main(String[] args) {

        EmailAddress emailAddress1 = new EmailAddress("nikiDona@example.com");
        EmailAddress emailAddress2 = new EmailAddress("nikidona@example.com");

        HashSet<EmailAddress> emails = new HashSet<>();
        emails.add(emailAddress1);
        emails.add(emailAddress2);

        emailAddress1.equals(emailAddress2);
        emailAddress1.hashCode();
        emailAddress2.hashCode();

        System.out.println(emailAddress1.equals(emailAddress2));
        System.out.println(emailAddress1.hashCode());
        System.out.println(emailAddress2.hashCode());

        System.out.println(emails.size());

    }
}
