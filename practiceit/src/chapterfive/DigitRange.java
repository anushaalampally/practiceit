package chapterfive;

/*Write a method named digitRange that accepts an integer as a parameter and returns the range of values of its digits.
The range is defined as 1 more than the difference between the largest and smallest digit value. 
For example, the call of digitRange(68437) would return 6 because the largest digit value is 8 and the smallest is 3, so 8 - 3 + 1 = 6. If the number contains only one digit, return 1. 
		You should solve this problem without using a String.*/

public class DigitRange {
	
	public static int digitRange(int a){
		a=Math.abs(a);
		int b;
	   int small;
	   int large;
	   small=a%10;
	   large=small;
	   a=a/10;
		while(a>0){
			b=a%10;
			a=a/10;
			if(large<b){
				large=b;
			}
			if(small>b){
				small=b;
			}
			}
		
		int c=large-small+1;
		return c;
		}

}
