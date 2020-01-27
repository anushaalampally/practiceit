package chapterthree;

import java.util.Scanner;


/*Write code to read an integer from the user, then print that number multiplied by 2. You may assume that the user types a valid integer. A sample run of the code would produce the following:

Type an integer: 4
4 times 2 = 8*/

public class PromptMultiplyBy2 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		    System.out.print("Type an integer: ");
			int number =a.nextInt();
		    int i=number;
		    int k=2;
		   
		    System.out.println(+i+" times " +k+" = "+i*k);

	}

}
