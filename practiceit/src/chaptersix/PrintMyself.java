package chaptersix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Write a complete Java program that prints itself to the console as output. 
Assume that the program is stored in a file named PrintMyself.java,
and make your code open the file PrintMyself.java and print its contents to the console.*/

public class PrintMyself {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner i=new Scanner(new File("PrintMyself.java"));
         while(i.hasNextLine()){
	      System.out.println(i.nextLine());
}
	}

}