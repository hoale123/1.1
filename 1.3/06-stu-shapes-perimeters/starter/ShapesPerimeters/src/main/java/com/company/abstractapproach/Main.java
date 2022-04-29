package com.company.abstractapproach;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Big", "red", 5, 6, 26);
        circle.setColor("red");
        circle.setName("Big");
        circle.area();
        circle.perimeter();

//        circle.
        System.out.println(circle.perimeter());
    }
}
