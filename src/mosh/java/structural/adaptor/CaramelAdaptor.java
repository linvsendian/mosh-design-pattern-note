package structural.adaptor;

import structural.adaptor.lib.Caramel;

public class CaramelAdaptor extends Caramel implements Filter{

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
