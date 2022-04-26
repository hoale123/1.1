package com.company;

import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the width?");
        int width = Integer.parseInt(scan.nextLine());

        System.out.println("What is the length?");
        int length = Integer.parseInt(scan.nextLine());

        int area =  width * length;
        System.out.println("The area is " + area + ".");

        int perimeter = (width + length) * 2;
        System.out.println("The perimeter is " + perimeter + ".");

        //cost
        double cementCost = 12.5;
        System.out.println("The cost of the cement is " + (cementCost * area) + ".");
        double framingCost = 8.25;
        System.out.println("The cost of the framing is " + (framingCost * perimeter) + ".");

        System.out.format("The cost of the concrete is %f. %n", area*cementCost);
        System.out.format("The cost of the framing/footers is %f. %n", perimeter*framingCost);
    }
}
