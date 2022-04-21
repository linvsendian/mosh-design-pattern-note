package creational.abstractFactory;

import creational.abstractFactory.ant.AntWidgetFactory;
import creational.abstractFactory.app.ContractForm;

public class Main {
    public static void main(String[] args) {
        ContractForm contractForm = new ContractForm();
        contractForm.render(new AntWidgetFactory());
    }
}
