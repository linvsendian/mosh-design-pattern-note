package creational.builder;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();
    public void addSlide(Slide slide){
        slides.add(slide);
    }
    public void export(PresentationBuilder build){
        build.addSlide(new Slide("Copyright"));
        for(Slide slide : slides)
            build.addSlide(slide);

//        if(format == PresentationFormat.PDF){
//            pdfDocument pdf = new pdfDocument();
//            for(Slide slide : slides)
//                pdf.addPage(slide.getText());
//        }
//        else if(format == PresentationFormat.MOVIE){
//            Movie movie = new Movie();
//            for(Slide slide : slides)
//                movie.addFrame(slide.getText(), 3);
//        }
    }
}
