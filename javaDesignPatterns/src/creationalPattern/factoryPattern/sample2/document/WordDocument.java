package creationalPattern.factoryPattern.sample2.document;

import creationalPattern.factoryPattern.sample2.documentAbstract.IDocument;

public class WordDocument implements IDocument {

    @Override
    public void createDocument() {
        System.out.println("Creating a Word Document...");
    }
}
