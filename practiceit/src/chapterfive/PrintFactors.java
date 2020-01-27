package chapterfive;

/*Write a method named printFactors that accepts an integer as its parameter and uses a fencepost loop to print the factors of that number, separated by the word " and ". For example, the number 24's factors should print as:

1 and 2 and 3 and 4 and 6 and 8 and 12 and 24
You may assume that the number parameter's value is greater than 0.
*/
public class PrintFactors {
	




	public static void printFactors(int a){
	int b;
	
			for(int i=1;i<=a;i++){
				if(a%i==0){
			     b=i;
			     if(i!=a)
			    System.out.print(i+" and ");
			     else {
			    	 System.out.print(i);
			     }
			    
			}
		}
		
		
	}

}
