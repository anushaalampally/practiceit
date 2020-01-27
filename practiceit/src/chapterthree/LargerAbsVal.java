package chapterthree;

/*Write a method called largerAbsVal that takes two integers as parameters and returns the larger of the two absolute values. 
A call of largerAbsVal(11, 2) would return 11, and a call of largerAbsVal(4, -5) would return 5.*/

public class LargerAbsVal {
	
	
	public static int largerAbsVal(int a,int b){
		int c=Math.abs(a);
		int d=Math.abs(b);
		
   if(c>=d){
			System.out.println(c);
			return c;
			}
	else{
		System.out.println(d);	
		return d;
		}
		
	}

}
