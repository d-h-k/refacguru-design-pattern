package prototype_persudo;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final List<Shape> OriginalShapes;

    public static void main(String[] args) throws CloneNotSupportedException {
        Application application = new Application();
        application.run();
    }

    public Application() throws CloneNotSupportedException {
        this.OriginalShapes = new ArrayList<>();
        circleApp();
        rectangleApp();

    }

    private void run() {
        List<Shape> cloneShapes = businessLogic();
        System.out.println("OriginalShapes=" + OriginalShapes.toString());
        System.out.println("cloneShapes=" + cloneShapes.toString());
    }

    private List<Shape> businessLogic() {
        List<Shape> cloneShapes = new ArrayList<>();
        OriginalShapes.forEach(shape -> {
            try {
                cloneShapes.add(shape.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        });
        return cloneShapes;
    }

    private void rectangleApp() throws CloneNotSupportedException {
        Rectangle rectangleOriginal = new Rectangle(10, 10, "BLUE", 10, 10);
        OriginalShapes.add(rectangleOriginal);
        Rectangle cloneRectangle = rectangleOriginal.clone();
        OriginalShapes.add(cloneRectangle);
        //System.out.println("rectangleOriginal=" + rectangleOriginal);
        //System.out.println("cloneRectangle=" + cloneRectangle);
    }

    private void circleApp() throws CloneNotSupportedException {
        Circle circleOriginal = new Circle(10, 10, "RED", 10);
        OriginalShapes.add(circleOriginal);
        Circle cloneCircle = circleOriginal.clone();
        OriginalShapes.add(cloneCircle);
        //System.out.println("circleOriginal=" + circleOriginal);
        //System.out.println("cloneCircle=" + cloneCircle);
    }
}
