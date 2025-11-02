package solution_book_stream_api.task12;

public class User {
    //Преобразование объектов в одно поле
    // Из списка User получи список всех их email-адресов через map().

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}
