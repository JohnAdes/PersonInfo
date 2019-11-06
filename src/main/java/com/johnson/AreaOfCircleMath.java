package com.johnson;


import java.util.Scanner;

public class AreaOfCircleMath {

    public static void main(String[] args){

        Scanner math = new Scanner(System.in);
        System.out.println("Enter a value for your radius ");
        double radius = math.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("The area of the circle is " + area);
    }


}
