package solution_book.objects.task12;

public class FilePath {

    //Класс FilePath
    // Поле: path. Пути с одинаковыми значениями считаются равными,
    // но сравнение должно быть нечувствительным к регистру.

    private String path;

    public FilePath(String path){
        this.path = path;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        FilePath that = (FilePath) obj;
        return this.path.equalsIgnoreCase(that.path);
    }
}
