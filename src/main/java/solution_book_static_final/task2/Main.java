package solution_book_static_final.task2;

public class Main {

    public static void main(String[] args) {
     User[] users = {
             new User("Alesya"),
             new User("Petya"),
             new User("Vlad")
     };

       for (User user: users){
           System.out.println(user.getName());
       }

        System.out.println(User.getCount());
    }

}
