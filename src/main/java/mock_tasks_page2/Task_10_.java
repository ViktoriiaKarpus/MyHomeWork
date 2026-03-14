package mock_tasks_page2;

public class Task_10_ {


    //Подсчёт слов в строке

    public static int countWords(String str){

        if(str == null || str.trim().isEmpty()){
            return 0;
        }
        str = str.trim().toUpperCase();

        String [] words = str.split("\\s");

        return words.length;


    }

    public static void main(String[] args) {
        String str = "Hello world! I am awesome";

        countWords(str);

        System.out.println(countWords(str));
    }
}
