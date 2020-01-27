package chapterfive;

import java.util.Scanner;


/*Write a sentinel loop that repeatedly prompts the user to enter a number and, once the number -1 is typed, displays the maximum and minimum numbers that the user entered. Here is a sample dialogue:

Type a number (or -1 to stop): 5
Type a number (or -1 to stop): 2
Type a number (or -1 to stop): 17
Type a number (or -1 to stop): 8
Type a number (or -1 to stop): -1
Maximum was 17
Minimum was 2*/

public class SentinelMinMax {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		System.out.print("Type a number (or -1 to stop): ");
		int number =a.nextInt();
		int k=number;
		int p=number;
		
		while(!(number==-1)){
			
			System.out.print("Type a number (or -1 to stop): ");
			if(k<number){
				k=number;
			}else if(p>number)
			{
				p=number;
			}
			number=a.nextInt();
			
		}
		if(k!=-1||p!=-1){
		System.out.println("Maximum was "+k);
		System.out.println("Minimum was "+p);
		}
	

	}

}
