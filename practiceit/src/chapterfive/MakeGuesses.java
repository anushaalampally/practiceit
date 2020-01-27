package chapterfive;

import java.util.Random;

/*Write a method named makeGuesses that will guess numbers between 1 and 50 inclusive until it makes a guess of at least 48. It should report each guess and at the end should report the total number of guesses made. Below is a sample execution:

guess = 43
guess = 47
guess = 45
guess = 27
guess = 49
total guesses = 5
(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)*/

public class MakeGuesses {
	
	
	public static void  makeGuesses(){
		int count=0;
		Random r=new Random();
		int guess ;
		
		do{
			guess=r.nextInt(50)+1;
		System.out.println("guess = "+guess);
		
			count++;
			
			}while(guess<48);
		
	System.out.println("total guesses = "+count);
	
	
	}

}
