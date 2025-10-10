package solution_book.objects.task9;

public class Main {
    //Класс Event
    // Поля: date, title. Переопредели toString(),
    // чтобы результатом был читаемый текст наподобие: "12.05.2025 — Встреча с клиентом".

    public static void main(String[] args) {
        Event event = new Event("12.05.2025", "Meet with the client");

        System.out.println(event);
    }
}
