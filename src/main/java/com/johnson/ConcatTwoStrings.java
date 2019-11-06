package com.johnson;

import java.util.Scanner;

public class ConcatTwoStrings {

    public static void main(String[] args) {

        Scanner concat = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = concat.nextLine();
        System.out.println("Enter second string");
        String s2 = concat.nextLine();

        String s3= s1 + s2;
        System.out.println("The result of " + s1 + " and " + s2 + " is " + s3);
    }
}