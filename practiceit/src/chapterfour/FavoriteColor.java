package chapterfour;

import java.util.Scanner;

/*The following code contains a bug. 
Examine the code and figure out the case(s) in which the code would behave incorrectly. 
Then correct the bug in the code.
*/
public class FavoriteColor {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your favorite color? ");
		String name = console.next();
		if (name.equals("blue")) {
		    System.out.println("Mine, too!");
		}
	}

}
