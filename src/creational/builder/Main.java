package creational.builder;

public class Main {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("text 1"));
        presentation.addSlide(new Slide("text 2"));

        pdfDocumentBuilder builder = new pdfDocumentBuilder();
        presentation.export(builder);
        pdfDocument pdf = builder.getPdfDocument();
        System.out.println(pdf);

        MovieBuilder movieBuilder = new MovieBuilder();
        presentation.export(movieBuilder);
        Movie movie = movieBuilder.getMovie();
        System.out.println(movie);
    }
}
