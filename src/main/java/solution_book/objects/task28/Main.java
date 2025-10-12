package solution_book.objects.task28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    //Класс GameScore
    // Поля: playerName, score.
    // Сравнение по убыванию счёта. Равенство — по имени и счёту.
    public static void main(String[] args) {
        GameScore player1 = new GameScore("Alice", 120);
        GameScore player2 = new GameScore("Bob", 220);
        GameScore player3 = new GameScore("Charlie", 180);
        GameScore player4 = new GameScore("Alice", 120);

        System.out.println("player1 equals player2 ? : " + player1.equals(player2));
        System.out.println("player2 equals player3 ? : " + player2.equals(player3));
        System.out.println("player3 equals player4 ? : " + player3.equals(player4));
        System.out.println("player1 equals player4 ? : " + player1.equals(player4));

        List<GameScore> scores = new ArrayList<>();
        scores.add(player1);
        scores.add(player2);
        scores.add(player3);
        scores.add(player4);



        System.out.println("Before sort: " );
        for (GameScore gs: scores){
            System.out.println(gs);
        }

        Collections.sort(scores);

        System.out.println("After sort: " );
        for (GameScore gs: scores){
            System.out.println(gs);
        }
    }
}
