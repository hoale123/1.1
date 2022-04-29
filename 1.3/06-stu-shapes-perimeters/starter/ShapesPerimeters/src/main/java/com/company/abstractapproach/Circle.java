package com.company.abstractapproach;

public class Circle extends Shape{

    private double radius;

    //comment for question.
    public Circle(String name, String color, int xCoord, int yCoord, double radius) {
        super(name, color, xCoord, yCoord);
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
