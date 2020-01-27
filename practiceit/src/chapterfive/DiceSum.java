package chapterfive;

import java.util.Random;
import java.util.Scanner;

/*Write a method named diceSum that prompts the user for a desired sum, then repeatedly rolls two six-sided dice until their sum is the desired sum. Here is the expected dialogue with the user:

Desired dice sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9
(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)*/

public class DiceSum {
	
	public static void diceSum(){
		int die1;
		int die2;
		int k=0;
		Scanner a=new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int number=a.nextInt();
		Random r1=new Random();
		
		while(k!=number){
			die1=r1.nextInt(6)+1;
			die2=r1.nextInt(6)+1;
			k=die1+die2;
			System.out.println(die1+" and "+die2+" = "+k);
		}
	}

}
