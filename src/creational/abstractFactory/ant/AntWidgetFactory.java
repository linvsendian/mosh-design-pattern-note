package creational.abstractFactory.ant;

import creational.abstractFactory.Button;
import creational.abstractFactory.TextBox;
import creational.abstractFactory.WidgetFactory;
import creational.abstractFactory.material.MaterialButton;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
