/*****
Practice Exercise 1B - The guessing game of "Higher" or "Lower".
In this simple program, you play against the computer alternating between 
guesses of a random number between 1 and 100. You each select a random number 
from 1 to 100 then, starting with the human player, he/she tries to guess the computer's
number. The computer responds with either "HIGHER" or "LOWER" or "RIGHT!". If the human
player does not guess right, then the computer gets a turn attempting to guess the human's
number. The game continues until one of the two players guesses the other's number.
*/

/**
Main driver class that creates an instance of the game and starts the game.
*/
public class HighLowGameDriver
{

	/** The main method call to start the program */
	public static void main(String[] args)
	{
		/** Creates an instance of the game */
		HighLowGame game = new HighLowGame();

		/** Starts the game */
		game.startGame();		

	}


}
