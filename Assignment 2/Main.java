package com.example;

import java.util.Scanner;

//Caleb Kroon - Computer Science & Digital Media
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to the quiz! There are 3 questions, each worth 1 point.");
        System.out.println("What is the largest ocean on Earth?");
        String answer1 = sc.nextLine();
        // Checking answer using equalsIgnoreCase so the user can input in any case
        // Also using || (or) as there are two ways to phrase the correct answer
        if (answer1.equalsIgnoreCase("Pacific") || answer1.equalsIgnoreCase("Pacific Ocean")) {
            System.out.println("Correct!");
            score++;
        }
        else { 
            System.out.println("Incorrect. The correct answer is the Pacific Ocean.");
        }
        System.out.println("What are the first six digits of pi?");
        String answer2 = sc.nextLine();
        if (answer2.equalsIgnoreCase("3.14159")) {
            System.out.println("Correct!");
            score++;
        }
        else {
            System.out.println("Incorrect. The correct answer is 3.14159.");
        }
        System.out.println("What year was Marist founded?");
        String answer3 = sc.nextLine();
        if (answer3.equalsIgnoreCase("1929")) {
            System.out.println("Correct!");
            score++;
        }
        else {
            System.out.println("Incorrect. The correct answer is 1929.");
        }
        System.out.println("Your final score is: " + score + " out of 3");
    }
}

// What I learned: I am now refreshed on using if, else if, and else statements, 
// as well as scanners to take user input and store it in variables.