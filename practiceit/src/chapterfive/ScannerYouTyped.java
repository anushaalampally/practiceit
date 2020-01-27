package chapterfive;

import java.util.Scanner;

/*Write a piece of code that prompts the user for a number and then prints a different message depending on whether the number was an integer or a real number. Here are two sample dialogues:

Type a number: 42.5
You typed the real number 42.5
Type a number: 3
You typed the integer 3*/

public class ScannerYouTyped {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Type a number: ");
	   
		if(a.hasNextInt()){
	    	int number=a.nextInt();
	        int b=number;
	        System.out.print("You typed the integer "+b);
	    	}
	    else if(a.hasNextDouble()){
		double number =a.nextDouble();
		double b=number;
		System.out.print("You typed the real number "+b); 
	   
	}

	}

}
