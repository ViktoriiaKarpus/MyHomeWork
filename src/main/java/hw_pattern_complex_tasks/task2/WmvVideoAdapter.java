package hw_pattern_complex_tasks.task2;

import java.util.stream.Stream;

public class WmvVideoAdapter implements VideoAdapter {

    private final WmvVideo wmvVideo = new WmvVideo();

    @Override
    public Stream<String> convertToMP4(String videoPath) {
        String wmvData = wmvVideo.getWMVData(videoPath);

        return Stream.of("Mp4 stream from WMV: " + wmvData);
    }
}
