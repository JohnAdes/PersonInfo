package com.johnson;

import java.util.Scanner;

import static java.lang.System.*;

public class AreaOfCircle {

    public static void main(String[] args){
        double radius;
        double area;
        int circle;


        Scanner input = new Scanner(in);

        System.out.println("Number of Circle ");
        circle = input.nextInt();

        double [] sumAreas;

        for (int i=0; i<circle; i++) {
            out.println("Enter a value for your radius ");
            radius = input.nextDouble();

            area = radius * radius * Math.PI;

            out.println("The area of the circle is " + area);

            }
//        int sum = 0;
//        for (int j=0; j<circle; j++) {
//            double sumAreas = area + i;
//            System.out.println("sum of the total areas of circle is " + sumAreas);
//        }

        input.close();


        }
//
//


    }



