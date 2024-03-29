package chapterfive;

import java.util.Scanner;


/*Write a method named printAverage that accepts a Scanner for the console as a parameter and repeatedly prompts the user for numbers. Once any number less than zero is typed, the average of all non-negative numbers typed is displayed. Display the average as a double, and do not round it. For example, a call to your method might look like this:

Scanner console = new Scanner(System.in);
printAverage(console);
The following is one example log of execution for your method:

Type a number: 7
Type a number: 4
Type a number: 16
Type a number: -4
Average was 9.0
If the first number typed is negative, do not print an average. For example:

Type a number: -2*/

public class PrintAverage {
	
	public static void printAverage(Scanner console){
		double average ;
       double sum=0;
		int i = 0;
		
		System.out.print("Type a number: ");
		int number=console.nextInt();
    if(number<0){
			return;
		}
		while(number>=0){
			 i++;
		  sum=sum +number;
		   System.out.print("Type a number: ");
	         number=console.nextInt();
		   }
    
		  average=sum/i;
		System.out.println("Average was "+average);
    
	}

}
