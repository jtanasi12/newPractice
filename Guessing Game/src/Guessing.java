
import java.util.*;


public class Guessing 

{
	
	// This is a new comment that we are adding to the program.
	
	public static void main(String[] args)
	{
		
//**************************************************
//					VARIABLES
//**************************************************

		final int MAX     = 10; 
		int answer, guess = 0;
		
		Scanner scan = new Scanner(System.in);
		Random  gen  = new Random(); 
		
		
		
		
		
		answer = gen.nextInt(MAX) + 1; // Generate Random Number between 1 and 10 
		
		System.out.print("I'm thinking of a number between 1 and " + MAX + ". Guess what it is: ");
		guess = scan.nextInt();
		
		
		if (guess == answer)
			System.out.println("You got it! Good Guessing!");
		else
			System.out.println("That is not correct, sorry");
		    System.out.println("The correct number was " + answer);

		
		
	}

}
