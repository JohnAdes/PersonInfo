package com.johnson;

import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to BMI Calculator!");

        Scanner bmi = new Scanner(System.in);
        System.out.println("Your height in meters");
        double hgt = bmi.nextDouble();
        System.out.println("Your weight in kilogram");
        double wght = bmi.nextDouble();

        double sum = wght / (hgt * hgt);
        System.out.println("Your BMI is " + sum);

        bmi.close();



    }
}
