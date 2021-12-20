import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class S02MovingCircle extends GraphicsApp {

    private Circle circle;

    @Override
    public void initialize() {
        setCanvasSize(500, 500);
        circle = new Circle(getWidth() / 2, getHeight() / 2, 30, Colors.YELLOW);
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
        circle.move(1, 0);
        circle.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("S02MovingCircle");
    }
}
