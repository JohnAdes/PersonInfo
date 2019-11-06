package com.johnson;

import java.util.Scanner;

public class RandomNums {

    public static void main(String[] args){

        int rand = (int) (Math.random() * 10) + 1;
        int rand1 = (int) (Math.random() * 10) + 1;

        System.out.println("What is " + rand + " + "+ rand1 + "?");


        Scanner random = new Scanner(System.in);
        int result = random.nextInt();

//        while () {
            if (result == rand + rand1){
                System.out.println("You are correct!");

//                break;
            } else {
                System.out.println("You are wrong!");
            }
        }



    }

