package chapterfive;

/*Write a method named hasAnOddDigit that returns whether any digit of an integer is odd. Your method should return true if the number has at least one odd digit and false if none of its digits are odd. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.

For example, here are some calls to your method and their expected results:

Call	Value Returned
hasAnOddDigit(4822116)	true
hasAnOddDigit(2448)	false
hasAnOddDigit(-7004)	true
You should not use a String to solve this problem.*/

public class HasAnOddDigit {
	
	public static boolean hasAnOddDigit(int a){
		a=Math.abs(a);
		int b;
		int c;
		
		if(a==0){
			return false;
		}
	while(a>0){
		b=a%10;
		a=a/10;
		if(b%2==0){
			continue;
		}else {
			if(b%2!=0){
				return true;
			}
			
			
		}
		
	}
	return false;
	
	
	}

}
