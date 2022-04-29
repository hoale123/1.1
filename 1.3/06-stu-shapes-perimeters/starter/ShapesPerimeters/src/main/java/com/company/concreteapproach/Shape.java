package com.company.concreteapproach;

import static java.lang.Double.NaN;

public class Shape {
    protected String name;
    protected String color;
    protected int xCoordinate;
    protected int yCoordinate;

    public Shape(String name, String color, int xCoordinate, int yCoordinate) {
        this.name = name;
        this.color = color;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double area(){
        return NaN;
    }

    public double perimeter(){
        return NaN;
    }
}
