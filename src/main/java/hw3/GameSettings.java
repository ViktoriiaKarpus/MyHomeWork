package hw3;

public class GameSettings {
    /**
     * Создайте класс GameSettings с полями:
     * static int maxPlayers — общее ограничение игроков
     * final String gameName — название (нельзя менять)
     * int currentPlayers — сколько игроков в игре сейчас. Реализуйте конструктор,
     * статический метод setMaxPlayers(int),
     * метод addPlayer() — добавляет 1 игрока,
     * если не превышен maxPlayers, метод printGameStatus() — выводит название,
     * текущее и максимальное количество игроков.
     * В main: создайте 2 игры, измените maxPlayers,
     * добавьте игроков и выведите статус.
     */

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Невозможно добавить игрока. Достигнуто максимальное количество: " + maxPlayers);
        }
    }

    public void printGameStatus() {
        System.out.println("Game Name:" + gameName +
                " ,Current Players: " + currentPlayers +
                " ,Max Players: " + maxPlayers);
    }

}

