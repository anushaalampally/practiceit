package chapterfive;

/*Write a method named digitSum that accepts an integer as a parameter and returns the sum of the digits of that number. For example, digitSum(29107) returns 2+9+1+0+7 or 19. For negative numbers, 
return the same value that would result if the number were positive. For example, digitSum(-456) returns 4+5+6 or 15.
*/
public class DigitSum {
	
	public static int digitSum(int i){
		int j;
		int sum=0;
		i=Math.abs(i);
	
		while(i>0){
			j=i%10;
			i=i/10;
			
			sum=sum+j;
			
		}
	     return sum;
		
		
	}

}
