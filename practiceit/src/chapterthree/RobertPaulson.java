package chapterthree;

import java.util.Scanner;


/*Write code that prompts the user for a phrase and a number of times to repeat it, then prints the phrase that many times. Here is an example dialogue with the user:

What is your phrase? His name is Robert Paulson
How many times should I repeat it? 3
His name is Robert Paulson
His name is Robert Paulson
His name is Robert Paulson*/

public class RobertPaulson {

	public static void main(String[] args) {
		
		Scanner c=new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String name=c.nextLine();
		System.out.print("How many times should I repeat it? ");
		int times=c.nextInt();
		int j=times;
		for(int i=0;i<j;i++){
			String Givenname=name;
			System.out.println(Givenname);
			
			
		}
	}

}
