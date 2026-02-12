package hw_pattern_complex_tasks.task2;

import java.util.stream.Stream;

public class AviVideoAdapter implements VideoAdapter {

    private final AviVideo aViVideo = new AviVideo();

    @Override
    public Stream<String> convertToMP4(String videoPath) {
        String aviData = aViVideo.getAviData(videoPath);

        return Stream.of("MP4 stream from AVI: " + aviData);
    }
}
