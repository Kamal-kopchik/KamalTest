package figure;

import java.awt.*;

public class Circle extends Figure {

    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public boolean contains(int x, int y) {
        int x1 = x - this.x;
        int y1 = y - this.y;

        return Math.pow(x1, 2) + Math.pow(y1, 2) <= radius * radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
        if (isSelected()) {
            g.setColor(Color.RED);
            g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
        }
    }

    @Override
    public String toString() {
        return String.format("Circle(%d, %d, %d)", x, y, radius);
    }

}
