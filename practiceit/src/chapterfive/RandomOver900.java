package chapterfive;

import java.util.Random;
/*Write a do/while loop that repeatedly prints random numbers from 0 to 999 (inclusive) until a number above 900 (that is, greater than or equal to 900) is printed. At least one line of output should always be printed, even if the first random number is above 900. Here is a sample execution:

Random number: 235
Random number: 15
Random number: 810
Random number: 147
Random number: 915*/

public class RandomOver900 {
	public static void main(String[] args) {
		int n;
		do{
			
			Random r=new Random();
			 n=r.nextInt();
           System.out.println("Random number: "+n);
		}while(n<900);
		
		
	}
}
