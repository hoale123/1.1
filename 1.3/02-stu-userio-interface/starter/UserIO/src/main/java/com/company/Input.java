package com.company;

import com.company.interfaces.UserIO;

import java.util.Scanner;

public class Input implements UserIO {
    private Scanner scan;
//    private  Scanner scan = new Scanner(System.in);

    //create a Constructor.
    public Input(){
       this.scan = new Scanner(System.in);
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(scan.nextLine());
        //Integer = Wrapper;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        return Long.parseLong(scan.nextLine());
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(scan.nextLine());
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        return Float.parseFloat(scan.nextLine());
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }

//    public static void readInt(String prompt){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("int");
//    }
}
//    public int readInt(String prompt);
//    public long readLong(String prompt);
//    public double readDouble(String prompt);
//    public float readFloat(String prompt);
//    public String readString(String prompt);