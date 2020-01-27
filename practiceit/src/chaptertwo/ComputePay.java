package chaptertwo;


/*The following program redundantly repeats the same expressions many times. 
Modify the program to remove all redundant expressions using variables of appropriate types. 
(Your variables should be used to help solve the overall problem. You must use a sufficient number of variables to receive credit for solving this problem. 
		Declare and initialize each variable in its own statement on its own line.)*/
public class ComputePay {

	public static void main(String[] args) {
		
		int  x=4 + 5 + 8 + 4;
		    double y=8.75;
		     double  z=0.20;
		    
		    // Calculate pay at work based on hours worked each day
		    System.out.println("My total hours worked:"+x); 
		    System.out.println("My hourly salary:"+y);		    

		    System.out.println("My total pay:"+x*y);
		    

		    System.out.println("My taxes owed:"+x*y*z); // 20% tax
	}

}
