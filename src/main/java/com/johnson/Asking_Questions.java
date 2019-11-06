package com.johnson;

import java.util.Scanner;

public class Asking_Questions {

    public static void main(String[] args){

        String name;
        int age;
        double wage;

        Scanner ask = new Scanner(System.in);
        System.out.println("Hello. What's your name?");
        name = ask.nextLine();
        System.out.println("Hi " + name + "! How old are you?");
        age = ask.nextInt();
        System.out.println("So you're " + age + ", eh? That's not old at all!" + " How much do you make, " + name + "?");
        wage = ask.nextDouble();
        System.out.println(wage + "! That's really good for your " + age + "! ");

        ask.close();

    }
}

