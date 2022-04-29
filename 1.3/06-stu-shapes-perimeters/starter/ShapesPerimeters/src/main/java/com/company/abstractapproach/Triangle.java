package com.company.abstractapproach;

public class Triangle extends Shape{

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(String name, String color, int xCoord, int yCoord) {
        super(name, color, xCoord, yCoord);
    }

    @Override
    public double area() {
        double p = perimeter()/2;

        return Math.sqrt(p*(p-sideOne)* (p - sideTwo) * (p-sideThree));
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
