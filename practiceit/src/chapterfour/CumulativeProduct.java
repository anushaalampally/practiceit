package chapterfour;

import java.util.Scanner;

/*Write code to produce a cumulative product by multiplying together many numbers that are read from the console. Match the following format:

How many numbers? 4
Next number --> 7
Next number --> 2
Next number --> 3
Next number --> 15
Product = 630
*/
public class CumulativeProduct {

	public static void main(String[] args) {
		int b=1;
		Scanner a=new Scanner(System.in);
		System.out.print("How many numbers? " );
		int number =a.nextInt();
		for(int i=1;i<=number;i++){
			
		System.out.print("Next number --> ");
		int number1 =a.nextInt();
		 b=number1*b;
		
	}
		 System.out.print("Product = "+b);

	}

}
