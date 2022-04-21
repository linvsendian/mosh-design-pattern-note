package creational.abstractFactory.ant;

import creational.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("ant button");
    }
}
