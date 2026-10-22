package solution_book_static_final.task7;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void dogSays(){
        System.out.println("Dog " + name +  " says woof!" );
    }
}
