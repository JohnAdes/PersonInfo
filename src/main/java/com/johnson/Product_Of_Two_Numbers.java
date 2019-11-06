package com.johnson;

import java.util.Scanner;

public class Product_Of_Two_Numbers {

    public static void main(String[] args) {

        int num1, num2;

        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = num.nextInt();
        System.out.println("Enter second number:");
        num2 = num.nextInt();

        int result = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + result);
    }
}
