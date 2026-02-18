package hw_pattern_complex_tasks.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class VideoService {

    private final Map<String, VideoAdapter> adapters = new HashMap<>();

    public VideoService() {
        adapters.put("avi", new AviVideoAdapter());
        adapters.put("mov", new MovVideoAdapter());
        adapters.put("wmv", new WmvVideoAdapter());
    }


    public Stream<String> uploadVideo(String videoPath) {
        String extension = extractExtension(videoPath);

        VideoAdapter adapter = adapters.get(extension);

        if (adapter == null) {
            throw new IllegalArgumentException("Unsupported video format: " + videoPath);
        }

        return adapter.convertToMP4(videoPath);
    }

    public Stream<String> streamVideo(String videoId) {
        return Stream.of("Streaming video in MP4 format, video Id: " + videoId);
    }

    private String extractExtension(String path) {
        int lastDotIndex = path.lastIndexOf('.');

        if (lastDotIndex == -1 || lastDotIndex == path.length() - 1) {
            throw new IllegalArgumentException("Invalid file name: " + path);
        }

        return path.substring(lastDotIndex + 1).toLowerCase();
    }
}
