package com.johnson;

import java.util.Scanner;

public class Inches_To_MetersConversion {

    public static void main(String[] args) {


        Scanner conv = new Scanner(System.in);
        System.out.println("Enter a value in inches:");
        int inch = conv.nextInt();

        double metr = inch * (0.0254);
        System.out.println(inch + " inch(es) is " + metr + " meters");



    }
}

