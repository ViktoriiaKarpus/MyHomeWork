package solution_book.objects.task17;

import java.util.Objects;

public class Vote {

    //Класс Vote
    //Поля: voterId, choice. Два голоса считаются равными, если одинаков voterId.

    private String voterId;
    private int choice;

    public Vote(String voterId, int choice) {
        this.voterId = voterId;
        this.choice = choice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(voterId, vote.voterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voterId);
    }



}
