package behavioral.state;

public class Brush implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("brush mouse down");
    }

    @Override
    public void mouseUp() {
        System.out.println("brush mouse up");
    }
}
