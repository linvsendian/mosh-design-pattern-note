package creational.abstractFactory.ant;

import creational.abstractFactory.TextBox;

public class AntTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("ant textbox");
    }
}
