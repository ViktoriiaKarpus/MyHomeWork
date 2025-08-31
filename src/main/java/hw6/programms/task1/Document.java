package hw6.programms.task1;

public class Document {

    //1. Хранение уникальных идентификаторов пользователей
    //Задача:
    //Проверить, есть ли пользователь с заданным ID.

    private final String id;

    public Document(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }
}
