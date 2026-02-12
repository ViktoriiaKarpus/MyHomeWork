package hw_pattern_complex_tasks.task2;

import java.util.stream.Stream;

public class VideoService {

    private final VideoAdapter aviAdapter = new AviVideoAdapter();
    private final VideoAdapter movAdapter = new MovVideoAdapter();
    private final VideoAdapter wmvAdapter = new WmvVideoAdapter();

    public VideoService() {

    }

    public Stream<String> uploadVideo(String videoPath) {
        if (videoPath.endsWith(".avi")) {
            return aviAdapter.convertToMP4(videoPath);
        } else if (videoPath.endsWith(".mov")) {
            return aviAdapter.convertToMP4(videoPath);
        } else if (videoPath.endsWith(".wmv")) {
            return aviAdapter.convertToMP4(videoPath);
        }
        throw new IllegalArgumentException("Unsupported video format: " + videoPath);
    }

    public Stream<String> streamVideo(String videoId) {
        return Stream.of("Streaming video in MP4 format, video Id: " + videoId);
    }
}
