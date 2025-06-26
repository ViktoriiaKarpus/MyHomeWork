package static_final_public_default;

public class GameSettings {
    /**
     * Создайте класс GameSettings с полями:
     * static int maxPlayers — общее ограничение игроков
     * final String gameName — название (нельзя менять)
     * int currentPlayers — сколько игроков в игре сейчас.
     * Реализуйте конструктор, статический метод setMaxPlayers(int),
     * метод addPlayer() — добавляет 1 игрока, если не превышен maxPlayers,
     * метод printGameStatus() — выводит название, текущее
     * и максимальное количество игроков.
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

    public static int setMaxPlayers(int newMaxPlayers) {
        return maxPlayers = newMaxPlayers;
    }

    public void addPlayer(){
        if(currentPlayers < maxPlayers){
            currentPlayers++;
            System.out.println("You can add the player");
        } else{
            System.out.println("Impossible to add the player");
        }
    }

    public void printGameStatus(){
        System.out.println("Name Game: " +gameName +
                ", Current Players: " + currentPlayers +
                ", Max Players: " + maxPlayers);
    }





}
