package chaptersix;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*Write code to print the following four lines of text into a file named message.txt, in the same directory as your program. Notice that the third line is blank.

Testing,
1, 2, 3.

This is my output file.*/

public class WriteFourLines {

	public static void main(String[] args) throws FileNotFoundException {
		 FileOutputStream fout=new FileOutputStream("message.txt");  
		   PrintStream pout=new PrintStream(fout);  
		   pout.println("Testing,");  
		   pout.println("1, 2, 3.");  
		   pout.println(" ");
		   pout.println("This is my output file.");

	}

}
