package com.johnson;

import java.util.Scanner;

public class Grading {


    public static void main(String[] args) {

        String fname;
        String lname;
        int grade;
        int id;
        String login;
        double gpa;

        System.out.println("Please enter the following information so I can sell it for a profit!");

        Scanner student = new Scanner(System.in);
        System.out.println("First Name?");
        fname = student.nextLine();
        System.out.println("Last Name?");
        lname = student.nextLine();
        System.out.println("Grade (9-12?");
        grade = student.nextInt();
        System.out.println("Student ID?");
        id = student.nextInt();
        System.out.println("Login?");
        login = student.nextLine();
        login = student.nextLine();
        System.out.println("GPA (0.0-4.0?");
        gpa = student.nextDouble();

        System.out.println("Your Information: ");
        System.out.println("Login :" + login);
        System.out.println("ID: " + id);
        System.out.println("Name: " + lname + ", " + fname);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);

       student.close();


    }
}

