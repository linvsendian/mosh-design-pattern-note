package structural.adaptor;

import structural.adaptor.lib.Caramel;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
        imageView.apply(new CaramelAdaptor());

    }
}
