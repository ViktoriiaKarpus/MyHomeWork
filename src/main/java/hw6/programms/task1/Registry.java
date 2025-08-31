package hw6.programms.task1;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private final Map<String,Document> documents = new HashMap<>();

    public  boolean exists(String id){
        return documents.containsKey(id);
    }

    public void addDocument( Document doc){
        if(!documents.containsKey(doc.getId())){
            documents.put(doc.getId(), doc);
            System.out.println("The document was added: "
            + doc.getClass().getSimpleName()
            + "  ID = " + doc.getId());
        }else{
            System.out.println("The document with such ID already exists");
        }
    }
}
