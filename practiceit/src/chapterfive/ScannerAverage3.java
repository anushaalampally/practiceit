package chapterfive;

import java.util.Scanner;

/*Write code that prompts for three integers, averages them, and prints the average. Make your code robust against invalid input; if the user types a non-number, re-prompt with the same prompt message. (You may want to look at the getInt method discussed in Chapter 5. You can call that method in your solution if you like.) Here is an example dialogue:

Type an integer: 5
Type an integer: 2
Type an integer: 17
Average: 8.0*/

public class ScannerAverage3 {

	public static void main(String[] args) {
		double b=0.0;
		Scanner a=new Scanner(System.in);
	int i=0;	


while(i<3){
    System.out.print("Type an integer: ");
		if(a.hasNextInt()){
	    	int number=a.nextInt();
	        
	         b+=number;
	        i++;
	         }
	    else if(!a.hasNextInt()){
	    	
	    	String name =a.next();
			
	    }
}
		double average=b/3;

System.out.print("Average: "+average);

	}

}
