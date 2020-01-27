package chaptersix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*Write a method named printEntireFile that prompts the user for a file name and prints the contents of that file to the console as output. You may assume that the file exists. For example, if the file example.txt contains the following input data:

hello  how    are you
1 2 3 4

I am fine
Then the following would be an example dialogue of your method:

Type a file name: example.txt
hello  how    are you
1 2 3 4

I am fine*/

public class PrintEntireFile {
	
	public static void printEntireFile() throws FileNotFoundException{
		System.out.print("Type a file name: ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();

		Scanner i=new Scanner(new File(filename));
		 while(i.hasNextLine()){
			
		      System.out.println(i.nextLine());
		      }
	}

}
