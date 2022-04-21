package creational.abstractFactory.material;

import creational.abstractFactory.Button;
import creational.abstractFactory.TextBox;
import creational.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
