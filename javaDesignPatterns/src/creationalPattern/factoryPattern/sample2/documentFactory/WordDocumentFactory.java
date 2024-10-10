package creationalPattern.factoryPattern.sample2.documentFactory;

import creationalPattern.factoryPattern.sample2.document.WordDocument;
import creationalPattern.factoryPattern.sample2.documentAbstract.ADocumentFactory;
import creationalPattern.factoryPattern.sample2.documentAbstract.IDocument;

public class WordDocumentFactory extends ADocumentFactory {

    @Override
    public IDocument createDocument() {
        return new WordDocument();
    }
}
