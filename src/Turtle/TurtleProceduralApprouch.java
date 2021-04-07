package Turtle;

import java.util.Scanner;

public class TurtleProceduralApprouch {

    //STATE OF TURTLE
    static int y; // 0
    static int x; // 0
    static int direction; //direction

    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    public static boolean isPenDown = false;

    //STATE OF CANVAS
    public static final int HEIGHT = 20;
    public static final int WIDTH = 20;
    static char[][] field = new char[HEIGHT][WIDTH];

    static String cmd;
    static int steps;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

            run();

    }

    static void run() {
        init();
        readUserCommand(); // cmd = "print"

        while (!cmd.equals("exit")) {

            switch (cmd) {
                case "print":
                    print();
                    break;

                case "move":
                    move(steps);// move 5
                    break;

                case "turnleft":
                    turnLeft();
                    break;

                case "turnright":
                    turnRight();
                    break;

                case "pendown":
                    PutPenDown();
                    break;
                case "penup":
                    PutPenUp();
                    break;
            }
            readUserCommand();
        }
    }

    private static void init() {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = '.';
            }
        }
        direction = EAST;
    }

    static void readUserCommand() {
        String command = scan.nextLine().toLowerCase().trim(); //"move 5" -> {"move", "5"}
        String[] parts = command.split("\\s+");

        if (command.equals("")) {
            throw new RuntimeException("Empty command");
        } else if (parts.length == 1) {
            switch (command) {
                case "print":
                case "exit":
                case "turnright":
                case "turnleft":
                case "pendown":
                case "penup":
                    cmd = command;// print != Print

                    return;

                default:
                    throw new RuntimeException("Incorrect command \"" + command + "\"");
            }
        } else if (parts.length == 2 && parts[0].equals("move")) {
            try {
                cmd = parts[0];
                steps = Integer.parseInt(parts[1]); // "5" -> 5
            } catch (NumberFormatException ex) {
                throw new RuntimeException("Steps can not be String. Please enter number.");
            }
        } else {
            throw new RuntimeException("Incorrect command: " + command);
        }
    }

    static void move(int steps) {
        try {
            for (int i = 0; i < steps; i++) {
                if (isPenDown) {
                    field[y][x] = '*';
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

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Game over");
        }
    }

    static void PutPenDown() {
        isPenDown = true;
    }

    static void PutPenUp() {
        isPenDown = false;
    }

    static void turnLeft() {
        direction = (direction == NORTH) ? WEST : direction - 1;
    }

    static void turnRight() {
        direction = (direction == WEST) ? NORTH : direction + 1;
    }

    static void print() {
        for (char[] row : field) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }
}