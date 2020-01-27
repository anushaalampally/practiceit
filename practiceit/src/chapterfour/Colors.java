package chapterfour;

import java.util.Scanner;


/*Write a piece of code that reads a shorthand text description of a color and prints the longer equivalent. Acceptable color names are B for Blue, G for Green, and R for Red. If the user types something other than B, G, or R, the program should print an error message. Make your program case-insensitive so that the user can type an uppercase or lowercase letter. Here are two example executions:

What color do you want? R
You have chosen Red.
What color do you want? Bork
Unknown color: Bork*/

public class Colors {

	
	public static void main(String[] args) {
		
		
		Scanner a=new Scanner(System.in);
		    System.out.print("What color do you want? ");
			String color =a.next();
			String b=color.toUpperCase();
			
			switch(b){
			case "R":
				 System.out.println("You have chosen Red.");
				 break;
			case "G":
				 System.out.println("You have chosen Green.");
				 break;
			case "B":
				 System.out.println("You have chosen Blue.");
				 break;
				 default:
					 System.out.println("Unknown color: "+color);
					 break;
			}
	}
}
