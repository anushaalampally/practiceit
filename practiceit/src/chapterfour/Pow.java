package chapterfour;


/*Write a method named pow that accepts a base and an exponent as parameters and returns the base raised to the given power. For example, the call pow(3, 4) returns 3 * 3 * 3 * 3 or 81. Do not use Math.pow in your solution.
Assume that the base and exponent are non-negative.*/
public class Pow {
	
	public static int pow ( int i,int j){
		int m=1;
		for(int k=1;k<=j;k++){
			m=m*i;
				
		}
		return m;
	}

}
