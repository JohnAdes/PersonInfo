package com.johnson;

import java.util.Scanner;

public class SecondsToMinutes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
		System.out.println("Welcome to Java App Developer");

        int time;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter time spent in seconds- ");
		time = input.nextInt();

		int result = time/60;
		int result2 = time%60;

        System.out.println("The time you entered is " + result + " minutes " + result2 + " seconds");


//
//		int rad = 2;
//				double area = rad*rad*3.142;
//						System.out.println("The area of the circle is " + area);
    }

}



