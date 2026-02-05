package hw_pattern.task9_AdapterFiles;

public class DOCProcessor implements DocumentProcessor{
    @Override
    public void process() {
        System.out.println("Processing DOC file");
    }
}
