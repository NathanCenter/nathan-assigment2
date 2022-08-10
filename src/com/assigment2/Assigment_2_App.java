package com.assigment2;

import java.util.Random;
import java.util.Scanner;

public class Assigment_2_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// need to make a random number genterator
		// need to have a min and a max
		int min = 1;
		int max = 100;
		Random rand = new Random();
		int numberGen = rand.nextInt((max - min) + 1) + min;

		// we now have the random number now we need user input
		System.out.println("Pick a number bewteen 1 and 100");

		
		
		// now we need a for loop that goes up to 5 loops the if statement that loops
		// moves it the if 
		
		// statement in the loop it should stop
		// using an break it stops the loop
		// next step is refactor the if statement to match the program

		int i = 0;
		// through 5 times had to place it in the while loop and once it reach a true
		while (i <= 4) {
			i++;
			// user input
			Scanner scanner = new Scanner(System.in);
			String userInputString = scanner.nextLine();
			int userNumber = Integer.parseInt(userInputString);
			if (userNumber == 0) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (userNumber < numberGen) {
				System.out.println("Please pick a higher number.");

			}

			else if (userNumber > numberGen) {
				System.out.println("Please pick a lower number.");

			}

			else if (userNumber == numberGen) {
				System.out.println("You win!");
				break;
			}
			
			if (i == 5 && userNumber != numberGen) {
				System.out.println("You lose!");
				System.out.println("The number was to guess was:" + numberGen);
			}

		}

	}

}
