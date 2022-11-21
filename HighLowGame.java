import java.util.*;



/**
Class that contains all the logic to the High-Low guessing game. Handles both human and computer game play.
*/
public class HighLowGame
{
 /** We need a random number generator so the machine can pick a random number between 1 and 100 */
  private Random rn = new Random();

 /** We need a Scanner object so that we can accept keyboard input from the human player */
  private Scanner sc = new Scanner(System.in);

 /** The random number chosen by the computer is stored here */
  private int computer_number;

 /** When the computer makes a guess it will pick a number no lower than initially the number 1 */
  private int low_range = 1;

 /** When the computer makes a guess it will pick a number no higher than initially 100 */
  private int high_range = 100;

 /** Method that starts the game. Alternates between human and computer guesses */
	public void startGame()
	{
		/** A random number between 1 and 100 is chosen by the computer */
		computer_number = rn.nextInt(100) + 1;

		/** Variable that determines if we keep alternating between guesses. When this variable is set to
		false then the game is over */
		boolean play = true;

		do
		{
			/** First ask the human player to guess. Method returns TRUE if human player 
			does not guess right and we need to keep playing. */
			play = youGuess();

			/** If human did not guess right (play==true) then now its the computer's turn to guess. */
			if ( play == true )
				play = computerGuess();

			/** Keep playing if both the human and the computer did not guess correctly. */
		} while ( play == true);

		System.out.println( "\n\nGame Over\n\n");
	}

	/**
	Method that handles the game play for the human player. It prompts for a number between 1 and 100 and responds with
	either HIGHER, LOWER, or RIGHT. If RIGHT, the method returns boolean value FALSE to end the game.
	*/
	public boolean youGuess()
	{
		/** Prompt and get human's guess */
		System.out.println("Please enter a number between 1 and 100");

		String guess = sc.nextLine();

		/** I used nextLine() so I need to convert the String to an integer value (could of used method nextInt). */
		int guess_as_num = Integer.valueOf( guess );

		/** Answer HIGHER, LOWER, or RIGHT */
		if ( guess_as_num < computer_number )
			System.out.println("HIGHER");

		else if ( guess_as_num > computer_number )
			System.out.println("LOWER");

		else
		{
			/** If RIGHT, return FALSE so that the program ends */
			System.out.println("RIGHT!");
			return false;
		}
		
		/** Return TRUE to keep the game going */
		return true;
	}

	/**
	Method that holds the game logic for the computer player. Makes a random guess between low_range and high_range variables.
	Can detect if human is cheating. Returns FALSE if the game should continue or returns TRUE if the computer guesses RIGHT or
	determines human is cheating (to stop the game).
	*/
	private boolean computerGuess()
	{
		/** This line returns a random guess between the values of low_range and high_range variables */
		int compGuess = low_range + rn.nextInt( high_range - low_range + 1 );

		/** Computer tells human its guess and asks HIGHER, LOWER, or RIGHT? */
		System.out.println("I guess your number is " + compGuess + ". How did I do?" );

		/** This variable is used to force the human to answer HIGHER, LOWER, or RIGHT */
		boolean keep_asking;

		do
		{
			/** Set keep_asking variable to false. i.e: assume the human answers (H)igher, (L)ower, or (R)ight */
			keep_asking = false;

			/** Ask the human player */
			System.out.print("(H)igher, (L)ower, or (R)ight?. (Enter H, L, or R): ");

			/** Get response from human. Convert response to lowercase */
			String response = sc.nextLine().toLowerCase();

			switch ( response )
			{
				/** If the response is "HIGHER" then adjust my low_range variable to be what I guessed plus 1 for next time */
				case "h" : low_range = compGuess + 1;
					   break;

				/** If response is "LOWER" then adjust my high_range variable to what I guessed less 1 for next time */
				case "l" : high_range = compGuess - 1;
					   break;

				/** Computer guessed right! Return FALSE to end the game */
				case "r" : System.out.println( "Computer Wins!" );
					   return false;
	

				/** Human did not respond with "H","L",or "R" so we set the keep_asking variable to TRUE which loops back and
				forces the human to answer the question again */
				default  : System.out.println( "*** Please Answer H, L, or R ***" );
					   keep_asking = true;

			}

		/** Keep asking the human for a proper response. Either H,L, or R. */
		} while ( keep_asking == true );


		/** We can detect if the human is cheating if ever the high_range value of the guess drops below the low_range value of the guess.
		    Return FALSE if cheating is detected to end the game.
		*/
		if ( high_range < low_range )
		{
			System.out.println( "You're cheating! I know your number is " + compGuess );
			return false;

		}

		/** Computer has not guesses the human's number. Return TRUE to keep playing (now human's turn) */
		return true;

	}


}
