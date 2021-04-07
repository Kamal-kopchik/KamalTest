package Turtle;

public class Turtle {

    private int x;
    private int y;

    private int direction;

    private boolean isPenDown;

    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    private Canvas canvas;

    public Turtle(Canvas canvas, int direction) {
        this.canvas = canvas;
        this.direction = direction;
    }

    public void move(int steps) {
        try {
            for (int i = 0; i < steps; i++) {
                if (isPenDown) {
                    canvas.changeData(y, x, '*');
                }

                switch (direction) {

                    case NORTH:
                        y--;
                        break;

                    case EAST:
                        x++;
                        break;

                    case SOUTH:
                        y++;
                        break;

                    case WEST:
                        x--;
                        break;

                }
            }
            if (x >= canvas.width || y >= canvas.height || x < 0 || y < 0) {
                throw new ArrayIndexOutOfBoundsException("Out of range");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Game over");
            System.exit(0);
        }
    }

    public void turnLeft(){
        direction=(direction==NORTH) ? WEST : --direction;
    }

    public void turnRight(){
        direction=(direction==WEST) ? NORTH : ++direction;
    }

    public void putPenUp(){
        isPenDown=false;
    }
    public void putPenDown(){
        isPenDown=true;
    }

}


