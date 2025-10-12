package solution_book.objects.task29;

import java.util.*;

public class Main {

    //Класс DocumentVersion
    // Поля: docId, version.
    // Сравнение по version, equals() — по docId.

    public static void main(String[] args) {
        DocumentVersion d1 = new DocumentVersion("DOC-001", "1.0");
        DocumentVersion d2 = new DocumentVersion("DOC-001", "1.1");
        DocumentVersion d3 = new DocumentVersion("DOC-002", "2.0");
        DocumentVersion d4 = new DocumentVersion("DOC-003", "1.5");
        DocumentVersion d5 = new DocumentVersion("DOC-001", "1.0");

        System.out.println("d1 equals d2? : " + d1.equals(d2));
        System.out.println("d1 equals d5? : " + d1.equals(d5));

        List<DocumentVersion> versionList = new ArrayList<>();
        versionList.add(d1);
        versionList.add(d2);
        versionList.add(d3);
        versionList.add(d4);
        versionList.add(d5);

        System.out.println("Before sort: ");
        for (DocumentVersion dv : versionList){
            System.out.println(dv);
        }

        Collections.sort(versionList);

        System.out.println("After sort: ");
        for (DocumentVersion dv: versionList){
            System.out.println(dv);
        }

        System.out.println("Without duplicates: ");
        Set<DocumentVersion> set = new TreeSet<>(versionList);
        for (DocumentVersion dv: set){
            System.out.println(dv);
        }
    }
}
