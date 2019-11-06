package com.johnson;

import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args) {

        double num1, num2, num3;

        Scanner ask = new Scanner(System.in);
        System.out.println("What is your first number?");
        num1 = ask.nextDouble();
        System.out.println("What is your second number?");
        num2 = ask.nextDouble();
        System.out.println("What is your third number?");
        num3 = ask.nextDouble();

        double result = (num1 + num2 + num3)/2;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " /2" + " is " + result + "!");

    ask.close();
    }
}



