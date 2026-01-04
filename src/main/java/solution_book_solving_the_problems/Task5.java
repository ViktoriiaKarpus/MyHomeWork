package solution_book_solving_the_problems;

public class Task5 {
    //Задача 5: Сравнение строк
    //Описание:
    // Метод isSame(String a, String b) должен проверять равенство двух строк.
    // Но результат зависит от ссылок, а не содержимого.


        public boolean isSame(String a, String b) {
            return a.equals(b);
        }

}
