package solution_book.objects.task12;

public class Main {
    //Класс FilePath
    // Поле: path. Пути с одинаковыми значениями считаются равными,
    // но сравнение должно быть нечувствительным к регистру.


    public static void main(String[] args) {

        FilePath filePath1 = new FilePath("/..//..pAck//row");
        FilePath filePath2 = new FilePath("/..//..pack//row");
        FilePath filePath3 = new FilePath("/..//..pack/Row");

        filePath1.equals(filePath2);
        filePath1.equals(filePath3);
        filePath2.equals(filePath3);

        System.out.println(filePath1.equals(filePath2));
        System.out.println(filePath1.equals(filePath3));
        System.out.println( filePath2.equals(filePath3));

    }
}
