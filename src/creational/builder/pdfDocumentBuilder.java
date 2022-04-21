package creational.builder;

public class pdfDocumentBuilder implements PresentationBuilder{
    private pdfDocument pdfDocument = new pdfDocument();
    @Override
    public void addSlide(Slide slide) {
        pdfDocument.addPage(slide.getText());
    }
    public pdfDocument getPdfDocument(){
        return pdfDocument;
    }
}
