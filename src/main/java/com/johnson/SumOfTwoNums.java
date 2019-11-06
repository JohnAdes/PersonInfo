package com.johnson;

import java.util.Scanner;

public class SumOfTwoNums {

    public static void main(String[] args) {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int num1 = add.nextInt();
        System.out.println("Enter a double value");
        double num2 = add.nextDouble();

        double sum = num1 + num2;


        double prod = num1 * num2;


        double avg = (num1 + num2)/2;
        System.out.println("The sum of " + num1 + " and " + num2 + " = " + sum);
        System.out.println("The product of " + num1 + " and " + num2 + " = " + prod);
        System.out.println("The average of " + num1 + " and " + num2 + " = " + avg);

        add.close();
    }

}
