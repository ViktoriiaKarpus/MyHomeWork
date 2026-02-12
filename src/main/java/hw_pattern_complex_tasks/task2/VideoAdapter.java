package hw_pattern_complex_tasks.task2;

import java.util.stream.Stream;

public interface VideoAdapter {
    Stream<String> convertToMP4(String videoPath);
}
