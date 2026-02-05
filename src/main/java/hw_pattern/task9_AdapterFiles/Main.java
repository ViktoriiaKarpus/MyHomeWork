package hw_pattern.task9_AdapterFiles;

public class Main {
    public static void main(String[] args) {

        DocumentProcessor doc = new DOCProcessor();
        doc.process();

        DocumentProcessor pdf = new DocumentAdapter(new PDFProcessor());
        pdf.process();
    }
}
