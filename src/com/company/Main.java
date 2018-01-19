package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {
    //private static int < 10000;

    public static void main(String[] args) {
	// Write a guessing game program.
        // Your program should generate a random integer between 1 and 10000.
        // Prompt the user to enter a guess.
        // For each guess, output "HIGHER" if the guess is smaller than the random integer
        // or "LOWER" if the user's guess is larger than the random integer.
        // Also output the new range of eligible guesses.
        // When the user guesses the random integer, output a message that says so and displays the number guesses it took to get to the right number.
        // Additionally, it should show what numbers the user guessed along the way.
        // write your code here
        System.out.println("Welcome to Random Turkey Sandwich! This is a guessing game, for one person "  + "would you like to play? (Yes/No)");
        Scanner sc = new Scanner(System.in);
        String playGuessingGame = sc.nextLine();
        System.out.println("Please enter a random number > 1 < 10000");
        Random random = new Random();
        //int value = 1 + random.nextInt(10000);
        //int sandwichRandom = randomSelection.nextInt();
        //for (int x = 0; x < 10000; x++) {
            //System.out.print(random[] + " ");
        //while(ask){
        //System.out.println("guess");
        //System.out.println("Want another guess?");
        //Scanner sc = new Scanner(System.in);
        //String userAnswer = sc.nextLine();
        //if(userAnswer.equals("Yes")){
           //ask = true;
        //} else {
        //    ask = false;
        //higher or lower, notify player
        //
        }



    }

