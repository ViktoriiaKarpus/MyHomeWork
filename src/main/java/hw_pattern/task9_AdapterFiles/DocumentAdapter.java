package hw_pattern.task9_AdapterFiles;

public class DocumentAdapter implements DocumentProcessor{

    private PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        pdfProcessor.convertToDoc();
        System.out.println("Processing PDF file through adapter");
    }
}
