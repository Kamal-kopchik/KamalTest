package GUI;

public class GameModel {

    private int x;
    private int y;

    private int width;
    private int height;

    public GameModel(int width,int height){
        this.width=width;
        this.height=height;
    }

    public void moveUp(){
        y-=height;
    }

    public void moveDown(){
        y+=height;
    }

    public void moveLeft(){
        x-=width;
    }

    public void moveRight(){
        x+=width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
