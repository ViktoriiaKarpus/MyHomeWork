package classes_objects;

public class Teacher {

    /**
     * Создайте класс Teacher с полями name и subject.
     * Реализуйте конструктор, геттеры и сеттеры,
     * и метод printInfo(), выводящий информацию об учителе
     * и предмете.
     * В main измените предмет и
     * выведите обновлённую информацию.
     */

    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void printInfo(){
        System.out.println("Name :" + name + " " + "Subject :" + subject);
    }
}
