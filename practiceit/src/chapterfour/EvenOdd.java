package chapterfour;

import java.util.Scanner;


/*Write Java code to read an integer from the user, then print even if that number is an even number or odd otherwise.
 *  You may assume that the user types a valid integer. The input/output should match the following example:

Type a number: 14
even*/

public class EvenOdd {
	
	public static void main(String []args){
		Scanner d=new Scanner(System.in);
		System.out.print("Type a number: ");
		int even=d.nextInt();
        int k=even;
        if(k%2==0){
        	System.out.println("even");
        }
        else
        {
        	System.out.println("odd");
        }
	}
	

}
