package solution_book.objects.task2;

import java.util.Objects;

public class User {
    //Класс User
    // Поля: id, name, email.
    // Сравнение пользователей должно происходить по id. Переопредели equals() и hashCode().

    private Integer id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User that = (User)obj;
        return this.id.equals(that.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
