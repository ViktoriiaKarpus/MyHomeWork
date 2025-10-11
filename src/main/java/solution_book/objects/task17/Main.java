package solution_book.objects.task17;

public class Main {
    //Класс Vote
    // Поля: voterId, choice.
    // Два голоса считаются равными, если одинаков voterId.

    public static void main(String[] args) {
        Vote vote1 = new Vote("123456789", 1);
        Vote vote2 = new Vote("123456779", 2);
        Vote vote3 = new Vote("123456789", 3);

        vote1.equals(vote2);
        vote1.equals(vote3);
        vote2.equals(vote3);

        System.out.println( vote1.equals(vote2));
        System.out.println(vote1.equals(vote3));
        System.out.println( vote2.equals(vote3));

        System.out.println( vote1.hashCode());
        System.out.println(vote2.hashCode());
        System.out.println(vote3.hashCode());


    }
}
