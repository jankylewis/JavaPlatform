package creationalPattern.factoryPattern.sample2.documentFactory;

import creationalPattern.factoryPattern.sample2.document.ExcelDocument;
import creationalPattern.factoryPattern.sample2.documentAbstract.ADocumentFactory;
import creationalPattern.factoryPattern.sample2.documentAbstract.IDocument;

public class ExcelDocumentFactory extends ADocumentFactory {

    @Override
    public IDocument createDocument() {
        return new ExcelDocument();
    }
}
