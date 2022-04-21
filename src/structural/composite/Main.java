package structural.composite;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group();
        group1.addShape(new Shape());
        group1.addShape(new Shape());

        Group group2 = new Group();
        group2.addShape(new Shape());
        group2.addShape(new Shape());

        Group group = new Group();
        group.addShape(group1);
        group.addShape(group2);
        group.render();
        group.move();

    }
}
