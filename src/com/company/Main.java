package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] string = input.trim().split("\\s");
        Rational rational = new Rational();
        rational.setVal1(Integer.parseInt(string[0]));
        rational.setSign(string[1]);
        rational.setVal2(Integer.parseInt(string[2]));

        System.out.print(rational.toString());
    }

}
