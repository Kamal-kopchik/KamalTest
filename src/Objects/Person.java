package Objects;

import java.util.Scanner;

public class Person {

    Scanner in = new Scanner(System.in);
    private String name;
    private String lname;
    private String gender;
    private int age;
    private int[] arr;

    public Person() {
        lname = null;
        name = null;
        age = 0;
        gender = null;
    }

    public Person(String ln, String n, String g, int a) {
        lname = ln;
        name = n;
        gender = g;
        age = a;
        arr = new int[]{5, 8, 9, 7, 8, 5};
    }

    public void ShowData() {
        System.out.print(lname + " ");
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println();
    }

    public void setAge(int age) {
        if (age != 0) {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if (gender != null && !gender.equals("")) {
            this.gender = gender;
        }
    }

    public void setLname(String lname) {
        if (lname != null && !lname.equals("")) {
            this.lname = lname;
        }
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void print() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
