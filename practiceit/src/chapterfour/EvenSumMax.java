package chapterfour;

import java.util.Scanner;

/*Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the even numbers. You may assume that the user types at least one non-negative even integer.

how many integers? 4
next integer? 2
next integer? 9
next integer? 18
next integer? 4
even sum = 24
even max = 18*/

public class EvenSumMax {
	
	public static void evenSum(){
		int temp=0;
		int sum=0;
		Scanner a=new Scanner(System.in);
	    System.out.print("how many integers? ");
		int number =a.nextInt();
		int a1[]=new int[number];
		for(int i=0;i<number;i++){
		System.out.print("next integer? ");
		
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
		for(int i=0;i<a1.length;i++){
			if(a1[i]%2==0){
			sum=sum+a1[i];
		}
			}
		System.out.println("even sum = "+sum);
		for(int i=a1.length-1;i>=0;i--){
			if(a1[i]%2==0){
			temp=a1[i];
			break;
		}
			}
		System.out.println("even max = "+temp);
		
		
	}

}
