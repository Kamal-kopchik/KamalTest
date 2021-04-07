package com.company;

public class Singleton {
    private static Singleton singleton;
    private String value;
    private Singleton() {
        this.value = "I'm singleton";
    }

    public static Singleton create() {
        if (singleton == null) {
            singleton = new Singleton();
            return getSingleton();
        } else {
            return getSingleton();
        }
    }
    public static Singleton getSingleton(){
        return singleton;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}



