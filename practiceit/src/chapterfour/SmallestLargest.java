package chapterfour;

import java.util.Scanner;

/*Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all the numbers typed in by the user. You may assume the user enters a valid number greater than 0 for the number of numbers to read. Here is an example dialogue:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11
*/


public class SmallestLargest {
	
	public static void smallestLargest(){
		int temp;
				Scanner a=new Scanner(System.in);
			    System.out.print("How many numbers do you want to enter? ");
				int number =a.nextInt();
				int a1[]=new int[number];
				for(int i=0;i<number;i++){
				System.out.print("Number ");
				System.out.print(i+1+": ");
				 a1[i] =a.nextInt();
				
			}
				for(int i=0;i<number;i++){
					for(int j=i+1;j<number;j++){
						if(a1[i]>a1[j]){
							temp=a1[i];
							a1[i]=a1[j];
							a1[j]=temp;
							
							
						}
						
					}
					
					}
				System.out.println("Smallest = "+a1[0]);
				System.out.println("Largest = "+a1[number-1]);
				
		}

}
