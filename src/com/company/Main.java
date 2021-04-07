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

/*Singleton singleton= Singleton.create();
        Singleton singleton1=Singleton.create();
        Singleton singleton2= Singleton.create();
        Singleton singleton3=Singleton.create();
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
        singleton.setValue("Babab");
        System.out.println(singleton2.getValue());
        System.out.println(singleton3.getValue());
        */