package com.johnson;

import java.util.Scanner;

public class FahrenheitToCelsius {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
//		System.out.println("Welcome to Java App Developer");

            int time;
            float celsius;

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter time spent in seconds- ");
//		time = input.nextInt();
//
//		int result = time/60;
//		int result2 = time%60;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the value ");
            float fahrenheit = input.nextInt();
            celsius = (fahrenheit - 32)*5/9;

            System.out.println("The conversion of " + fahrenheit + " degree is = " + celsius + " degrees Celsius");


//
//		int rad = 2;
//				double area = rad*rad*3.142;
//						System.out.println("The area of the circle is " + area);
        }

    }

