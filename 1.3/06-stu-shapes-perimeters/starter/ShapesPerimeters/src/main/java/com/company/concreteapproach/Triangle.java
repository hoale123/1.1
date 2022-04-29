package com.company.concreteapproach;

public class Triangle extends Shape{

    public Triangle(String name, String color, int xCoordinate, int yCoordinate, double sideOne, double sideTwo, double sideThree) {
        super(name, color, xCoordinate, yCoordinate);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    private double sideOne;
    private double sideTwo;
    private double sideThree;


    public Triangle(String name, String color, int xCoordinate, int yCoordinate) {
        super(name, color, xCoordinate, yCoordinate);
    }

    public double area(){
        double p = perimeter() / 2;

        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p-sideThree));
    }

    public double perimeter(){
        return sideOne + sideTwo + sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }
}
