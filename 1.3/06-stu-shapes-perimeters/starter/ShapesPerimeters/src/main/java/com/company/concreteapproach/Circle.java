package com.company.concreteapproach;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, String color, int xCoordinate, int yCoordinate, double radius) {
        super(name, color, xCoordinate, yCoordinate);
        this.radius = radius;
    }
    public double area(){
        return radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
