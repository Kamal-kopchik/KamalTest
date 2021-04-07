package Turtle;

import java.util.Scanner;

public class Utils {

    private Scanner in;
    private int steps;
    private String cmd;

    public Utils() {
        in = new Scanner(System.in);

    }

    public void readUserCommand() {
        String command = in.nextLine().toLowerCase().trim();
        ;
        String[] parts = command.split("\\s+");
        if (command.equals("")) {
            throw new RuntimeException("Empty command");
        }
        else if (parts.length == 1) {
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
        }
        else if (parts.length == 2 && parts[0].equals("move")) {
            try {
                cmd = parts[0];
                steps = Integer.parseInt(parts[1]); // "5" -> 5
            } catch (NumberFormatException ex) {
                throw new RuntimeException("Steps can not be String. Please enter number.");
            }
        }
        else {
            throw new RuntimeException("Incorrect command: " + command);
        }
    }

    public int getSteps() {
        return steps;
    }

    public String getCmd() {
        return cmd;
    }
}
