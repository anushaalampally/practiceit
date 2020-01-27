package chapterfour;

import java.util.Scanner;

/*Write a method named printGPA that calculates a student's grade point average. The user will type a line of input containing the student's name, then a number of scores, followed by that many integer scores. Here are two example dialogues:

Enter a student record: Maria 5 72 91 84 89 78
Maria's grade is 82.8
Enter a student record: Jordan 4 86 71 62 90
Jordan's grade is 77.25
For example, Maria's grade is 82.8 because her average of (72 + 91 + 84 + 89 + 78) / 5 equals 82.8. Use a Scanner for user input.
*/
public class PrintGPA {
	
	public static void printGPA (){
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a student record: ");
		String m=a.next();
		int n=a.nextInt();
		int sum=0;
		
		for(int i=0;i<n;i++){
			sum=sum+a.nextInt();
		}
		double grade=1.0*sum/n;
		System.out.println(m+"'s grade is "+grade);
	}

}
