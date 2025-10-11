package solution_book.objects.task13;

public class Contact {

    //Класс Contact
    // Поля: name, phone. Переопредели equals(), чтобы сравнение шло только по телефону.
    // toString() возвращает имя и номер.

    private String name;
    private String phone;

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass()!= obj.getClass()) return false;
        Contact that = (Contact) obj;
        return this.phone.equals(that.phone);
    }

    @Override
    public String toString(){
        return "Phone: " + phone +  " Name: " + name;
    }

}
