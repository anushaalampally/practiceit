package chapterfive;

/*Write a method named allDigitsOdd that returns whether every digit of a given integer is odd. Your method should return true if the number consists entirely of odd digits and false if any of its digits are even. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits. Your method should work for positive and negative numbers.

For example, here are some calls to your method and their expected results:

Call	Value Returned
allDigitsOdd(4822116)	false
allDigitsOdd(135319)	true
allDigitsOdd(9175293)	false
allDigitsOdd(-137)	true
You should not use a String to solve this problem.*/

public class AllDigitsOdd {
	
	public static boolean allDigitsOdd(int a){
		a=Math.abs(a);
		int b;
		int c;
		/*while(a>0){
			if(a%2!=0){
			b=a%10;
	        a=a/10;
		  }else{
			  return false;
		  }
		}
		return true;*/
		if(a==0){
			return false;
		}
	while(a>0){
		b=a%10;
		a=a/10;
		if(b%2!=0){
			continue;
		}else{
			return false;
		}
		
	}
	return true;
	
	
	}

}
