package figure;

import java.awt.*;

public interface FigureInterface {

    public abstract boolean contains(int x, int y);
    public abstract void draw(Graphics g);

}
