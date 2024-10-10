package creationalPattern.factoryPattern.sample2.documentManager;

import creationalPattern.factoryPattern.sample2.documentAbstract.ADocumentFactory;
import creationalPattern.factoryPattern.sample2.documentAbstract.IDocument;

import java.util.ArrayList;
import java.util.List;

public class DocumentManager {

    private List<IDocument> _documents = new ArrayList<>();

    public void addDocument(ADocumentFactory documentFactory) {
        IDocument document = documentFactory.createDocument();
        _documents.add(document);
        document.createDocument();
    }

    public void showAllExistingDocuments() {
        System.out.println("Documents created: ");
        for (IDocument document : _documents)
            System.out.println(document.getClass().getSimpleName());
    }
}
