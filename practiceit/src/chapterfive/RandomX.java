package chapterfive;

import java.util.Random;

/*(This problem is a modified version of Chapter 5's randomX exercise from the textbook.)

Write a method named randomX that keeps printing lines, where each line contains a random number of x characters between 5 and 19 inclusive, until it prints a line with 16 or more characters. For example, the output from your method might be the following. Notice that the last line has 17 x characters.

xxxxxxx
xxxxxxxxxxxxx
xxxxxx  
xxxxxxxxxxx
xxxxxxxxxxxxxxxxx*/

public class RandomX {
	
	public static void  randomX(){
		int k;
	   Random r=new Random();
		do{
		 k=r.nextInt(15)+5;
		for(int i=0;i<k;i++){
			System.out.print("x");
		}
		System.out.println();
		}while(k<=16);
		 
	 }

}
