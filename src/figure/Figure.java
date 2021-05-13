package figure;


public abstract class Figure implements FigureInterface {

    protected int x;
    protected int y;
    private boolean selected;

    protected Figure (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}

