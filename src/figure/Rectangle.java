package figure;

import java.awt.*;

public class Rectangle extends Figure{

    int height; // высота
    int width; //  ширина

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public boolean contains(int x, int y) {
        return this.x < x && x < this.x + width && this.y < y && y < this.y + height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
        if (isSelected()) {
            g.setColor(Color.RED);
            g.drawRect(x, y, width, height);
        }
    }

    @Override
    public String toString() {
        return String.format("Rectangle(%d, %d, %d, %d)", x, y, width, height);
    }
}
