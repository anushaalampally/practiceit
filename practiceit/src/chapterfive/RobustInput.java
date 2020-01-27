package chapterfive;

import java.util.Scanner;


/*The following code is not robust against invalid user input. Change the code so that it will not proceed until the user has entered a valid age (any integer) and grade point average (GPA, any real number). You may assume that the user enters a single token of input each time when prompted. Here is a sample dialogue of how the code should behave:

Type your age: hello
Type your age: ?
Type your age: 3.14
Type your age: 25
Type your GPA: a
Type your GPA: bcd
Type your GPA: 2.5
age = 25, GPA = 2.5*/

public class RobustInput {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Type your age: ");
	   
		while(!a.hasNextInt()){
	    	a.next();
	    	System.out.print("Type your age: ");
	    	}
		int age=a.nextInt();
		System.out.print("Type your GPA: ");
	     while(!a.hasNextDouble()){
	    	   a.next();
	    	  System.out.print("Type your GPA: ");
	    	 
	      }
	     double gpa =a.nextDouble();
	     System.out.print("age = "+age+", GPA = "+gpa);

	}

}
