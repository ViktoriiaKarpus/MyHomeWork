package solution_book.objects.task14;

public class Grade implements Comparable<Grade> {
    //Класс Grade
    // Поля: studentName, subject, score.
    // Сравнение (compareTo()) должно идти по убыванию балла.



    private String studentName;
    private String subject;
    private int score;

    public Grade(String studentName,String subject, int score) {
        this.subject = subject;
        this.score = score;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public int compareTo(Grade other){
        return Integer.compare(other.score, this.score);
    }

    @Override
    public String toString() {
        return "Grade{" +
                "studentName='" + studentName + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }

}
