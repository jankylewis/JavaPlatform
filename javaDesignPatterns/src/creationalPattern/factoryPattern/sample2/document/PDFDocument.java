package creationalPattern.factoryPattern.sample2.document;

import creationalPattern.factoryPattern.sample2.documentAbstract.IDocument;

public class PDFDocument implements IDocument {

    @Override
    public void createDocument() {
        System.out.println("Creating a PDF Document...");
    }
}
