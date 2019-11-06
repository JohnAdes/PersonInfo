package com.johnson;

import java.util.Scanner;

public class PersonInfo {

    public static void main(String[] args) {
//      //initialize the variables.
        String myName, myEyes, myTeeth,myHair;
        int myAge, myHeight;

        //instantiate the object for user input
        Scanner info = new Scanner(System.in);
        System.out.println("Hello! What's your name, please? ");
        myName = info.nextLine();
        System.out.println("What's the color of your eyes, please? ");
        myName = info.nextLine();
        System.out.println("What's the color of your teeth, please? ");
        myName = info.nextLine();
        System.out.println("What's the color of your hair, please? ");
        myName = info.nextLine();
        System.out.println("If I may ask, how old are you? ");
        myAge = info.nextInt();
        System.out.println("How tall are you, please? ");
        myHeight = info.nextInt();


        System.out.println("Hi, lets talk about " + myName);
        System.out.println("They're " + myHeight + " inches tall.");
        System.out.println("They're " + myAge + " years old".);
        System.out.println("Huh, that's older than I expected...");
        System.out.println("They have " + myEyes + " eyes and " + myHair + " hair");
        System.out.println("Their teeth are usually " + myTeeth + " but it depends on the coffee.");
        System.out.println (" Their teeth are usually " + myTeeth + " , but it depends on the coffee");     .
        System.out.println("Alright, this is pretty boring. Let's stop talking about " + myName);

        info.close();

    }
}
