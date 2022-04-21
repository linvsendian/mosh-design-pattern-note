package creational.abstractFactory.app;

import creational.abstractFactory.WidgetFactory;

public class ContractForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
