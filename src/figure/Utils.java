package figure;

public class Utils {
    static Figure createFigure(String cmd) {
        switch (cmd) {
            case "circle":
                return new Circle(150, 50, 50);

            case "rectangle":
                return new Rectangle(0, 0, 100, 100);

            case "cross":
                return new Cross(250, 50, 100, 20);

            default:
                throw new RuntimeException("Incorrect command: " + cmd);
        }
    }
}

