package solution_book.objects.task9;

public class Event {
    //Класс Event
    // Поля: date, title. Переопредели toString(),
    // чтобы результатом был читаемый текст наподобие: "12.05.2025 — Встреча с клиентом".

    private String date;
    private String title;

    public Event(String date, String title) {
        this.date = date;
        this.title = title;
    }

    @Override
    public String toString(){
        return this.date + " - " + this.title;
    }

}
