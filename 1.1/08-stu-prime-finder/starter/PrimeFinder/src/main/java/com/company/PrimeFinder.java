package com.company;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        //Prompt
        Scanner scan  = new Scanner(System.in);
        //Read the number
        System.out.println("Please enter a number.");
        int userInput = Integer.parseInt(scan.nextLine());

        boolean prime;

        for (int i = 2; i <= userInput; i++){
            prime = true;
            // The actual prime checker
            for (int j = 2; j < i; j++){
                // if i is divisible by any j, set price to false
                if (i % j == 0){
                    prime = false;
                    break;
                }
            }
            //if prime is false, the number is not prime. dont print it
            if (prime){
                System.out.println(i);
            }
        }
    }
}
