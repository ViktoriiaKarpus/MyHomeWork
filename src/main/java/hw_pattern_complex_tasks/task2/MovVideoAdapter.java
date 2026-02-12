package hw_pattern_complex_tasks.task2;

import java.util.stream.Stream;

public class MovVideoAdapter implements VideoAdapter {

    private final MovVideo movVideo = new MovVideo();

    @Override
    public Stream<String> convertToMP4(String videoPath) {
        String movData = movVideo.getMoVData(videoPath);

        return Stream.of("MP4 stream from MOV: " + movData);
    }
}
