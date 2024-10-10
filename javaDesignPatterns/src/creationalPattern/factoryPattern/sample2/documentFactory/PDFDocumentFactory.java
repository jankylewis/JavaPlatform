package creationalPattern.factoryPattern.sample2.documentFactory;

import creationalPattern.factoryPattern.sample2.document.PDFDocument;
import creationalPattern.factoryPattern.sample2.documentAbstract.ADocumentFactory;
import creationalPattern.factoryPattern.sample2.documentAbstract.IDocument;

public class PDFDocumentFactory extends ADocumentFactory {

    @Override
    public IDocument createDocument() {
        return new PDFDocument();
    }
}
