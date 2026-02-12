package hw_pattern_complex_tasks.task2;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        VideoService videoService = new VideoService();

        String videoPath = "path/to/our/example.avi";
        Stream<String> uploadStream = videoService.uploadVideo(videoPath);
        String videoId = "video123";
        System.out.println("Upload result: " + uploadStream.findFirst().get());

        Stream<String> stream = videoService.streamVideo(videoId);
        System.out.println(stream.findFirst().get());
    }
}
