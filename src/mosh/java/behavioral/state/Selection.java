package behavioral.state;

public class Selection implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("selection mouse down");
    }

    @Override
    public void mouseUp() {
        System.out.println("selection mouse up");
    }
}
