package solution_book.objects.task19;

import java.util.Objects;

public class Message implements Comparable<Message> {

    //Класс Message
    // Поля: from, to, timestamp, content.
    // Сравнение по времени, equals() — по timestamp и from.

    private String from;
    private String to;
    private long timestamp;
    private String content;

    public Message(String from, String to, long timestamp, String content) {
        this.from = from;
        this.to = to;
        this.timestamp = timestamp;
        this.content = content;
    }

    @Override
    public int compareTo(Message other) {
        return Long.compare(this.timestamp, other.timestamp);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass()!=obj.getClass()) return false;
        Message that = (Message) obj;
        return this.timestamp==that.timestamp && this.from.equals(that.from);
    }

    @Override
    public int hashCode(){
        return Objects.hash(timestamp, from);
    }
}
