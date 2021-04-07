package com.company;

public class Circle {
    private double radius;
    private double area;
    public static int quantityOfCircles = 0;

    public Circle(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    public Circle(double radius) {
        this(radius, radius * radius * Math.PI);
        quantityOfCircles++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

     public String print() {
        return "Radius="+this.radius + " area=" + this.area;
    }

}
