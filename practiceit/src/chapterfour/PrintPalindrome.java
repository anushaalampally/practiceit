package chapterfour;

import java.util.Scanner;


/*Write a method called printPalindrome that accepts a Scanner for the console as a parameter, and prompts the user to enter one or more words and prints whether the entered String is a palindrome (i.e., reads the same forwards as it does backwards, like "abba" or "racecar"). If the following Scanner object were declared:

Scanner console = new Scanner(System.in);
printPalindrome(console);
The resulting output for a call where the user types a palindrome would be:

Type one or more words: racecar
racecar is a palindrome!
The output for a call where the user types a word that is not a palindrome would be:

Type one or more words: hello
hello is not a palindrome.*/
public class PrintPalindrome {
	
	public static void printPalindrome(Scanner a){
		
		    System.out.print("Type one or more words: ");
			String c =a.next();
	       System.out.println();
			int k=0;
			String d=c.toLowerCase();
			
			for(int i=0;i<=c.length()/2;i++){
				
			if(d.charAt(i)==d.charAt(d.length()-1-i)){
				
				continue;
				}
			
			else{
				System.out.println(c+" is not a palindrome.");
				k=1;
				break;
			}
			
			
			}
			if(k==0){
				System.out.println(c+" is a palindrome!");
			}
			
			
			
			
		}

}
