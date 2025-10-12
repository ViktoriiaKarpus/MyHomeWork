package solution_book.objects.task29;

import java.util.Objects;

public class DocumentVersion implements Comparable<DocumentVersion>{

    //Класс DocumentVersion
    // Поля: docId, version.
    // Сравнение по version, equals() — по docId.

    private String docId;
    private String version;

    public DocumentVersion(String docId, String version) {
       this.docId = docId;
        this.version = version;
    }

    @Override
    public int compareTo(DocumentVersion other){
        return this.version.compareTo(other.version);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentVersion that = (DocumentVersion) o;
        return Objects.equals(docId, that.docId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(docId);
    }

    @Override
    public String toString() {
        return "DocumentVersion{" +
                "docId='" + docId + '\'' +
                ", version='" + version + '\'' +
                '}';
    }


}
