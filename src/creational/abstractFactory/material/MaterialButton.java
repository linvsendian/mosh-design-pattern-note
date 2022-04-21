package creational.abstractFactory.material;

import creational.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("material button");
    }
}
