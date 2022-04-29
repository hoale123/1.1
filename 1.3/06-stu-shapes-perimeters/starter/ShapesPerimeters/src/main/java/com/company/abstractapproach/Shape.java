package com.company.abstractapproach;

public abstract class Shape {
    private String name;
    private String color;
    private int xCoordinate;
    private int yCoordinate;

    public Shape(String name, String color, int xCoord, int yCoord) {
        this.name = name;
        this.color = color;
        this.xCoordinate = xCoord;
        this.yCoordinate = yCoord;
    }

    public abstract double area();

    public abstract double perimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxCoord() {
        return xCoordinate;
    }

    public void setxCoord(int xCoord) {
        this.xCoordinate = xCoord;
    }

    public int getyCoord() {
        return yCoordinate;
    }

    public void setyCoord(int yCoord) {
        this.yCoordinate = yCoord;
    }
}
