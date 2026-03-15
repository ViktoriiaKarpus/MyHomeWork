package mock_tasks_page2;

public class Task_7_ {

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u') {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {


        String str = "Hello everyone! I am happy to see today".toLowerCase().trim();
        System.out.println(countVowels(str));

    }
}
