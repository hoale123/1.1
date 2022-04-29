package com.company.abstractapproach;

public class Square extends Shape{

    private double side;

    public Square(String name, String color, int xCoord, int yCoord) {
        super(name, color, xCoord, yCoord);
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
