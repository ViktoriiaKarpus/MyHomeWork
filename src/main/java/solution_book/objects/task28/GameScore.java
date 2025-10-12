package solution_book.objects.task28;

import java.util.Objects;

public class GameScore implements Comparable<GameScore>{
    //Класс GameScore
    // Поля: playerName, score.
    // Сравнение по убыванию счёта.
    // Равенство — по имени и счёту.

    private String playerName;
    private int score;

    public GameScore(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    @Override
    public int compareTo(GameScore other){
        return Integer.compare(other.score,this.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameScore gameScore = (GameScore) o;
        return score == gameScore.score && Objects.equals(playerName, gameScore.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, score);
    }

    @Override
    public String toString() {
        return "GameScore{" +
                "playerName='" + playerName + '\'' +
                ", score=" + score +
                '}';
    }

}
