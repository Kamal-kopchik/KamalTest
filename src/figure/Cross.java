package figure;

import java.awt.*;

public class Cross extends Figure {

    private Rectangle vertical;
    private Rectangle horizontal;

    public Cross (int x, int y, int width, int heigth) {
        super(x, y);
        vertical = new Rectangle(this.x - width / 2, this.y - heigth / 2, width, heigth);
        horizontal = new Rectangle(this.x - heigth / 2, this.y - width / 2, heigth, width);
    }

    @Override
    public boolean contains(int x, int y) {
        return vertical.contains(x, y) || horizontal.contains(x, y);
    }

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        vertical.setSelected(selected);
        horizontal.setSelected(selected);
    }

    @Override
    public void draw(Graphics g) {
        vertical.draw(g);
        horizontal.draw(g);
    }

    @Override
    public void move(int x, int y) {
        vertical.move(x, y);
        horizontal.move(x, y);
    }

    @Override
    public String toString() {
        return String.format("Cross(%s, %s)", vertical.toString(), horizontal.toString());
    }
}
