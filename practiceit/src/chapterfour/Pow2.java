package chapterfour;


/*Write a method named pow2 (a variation of the previous pow exercise) that accepts a real number base and an integer exponent as parameters and returns the base raised to the given power.
Your code should work for both positive and negative exponents. For example, the call pow2(2.0, -2) returns 0.25. 
Do not use Math.pow in your solution.*/
public class Pow2 {
	
	public static double pow2(double a,int b){
		double total=1.0;
		int k;
		if(b>=0){
			for(int i=0;i<b;i++){
			total=total*a;
		}}
		
			else{
				k=Math.abs(b);
				for(int i=0;i<k;i++){
					total*=1/a;
				}
				
			}
		return total;
	}

}
