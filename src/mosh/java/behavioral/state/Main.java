package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
