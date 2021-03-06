package com.company.concreteapproach;

public class Square extends Shape {

    private double side;
    public Square(String name, String color, int xCoordinate, int yCoordinate, double side) {
        super(name, color, xCoordinate, yCoordinate);
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }
}
