package Turtle;

import javax.rmi.CORBA.Util;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Canvas canvas = new Canvas(20, 20);
        Turtle turtle = new Turtle(canvas, Turtle.EAST);
        Utils utils = new Utils();

        utils.readUserCommand();

        while (!utils.getCmd().equals("exit")) {
            switch (utils.getCmd()) {
                case "print":
                    canvas.print();
                    break;
                case "move":
                    turtle.move(utils.getSteps());
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "pendown":
                    turtle.putPenDown();
                    break;
                case "penup":
                    turtle.putPenUp();
                    break;

            }
            utils.readUserCommand();
        }
    }
}
