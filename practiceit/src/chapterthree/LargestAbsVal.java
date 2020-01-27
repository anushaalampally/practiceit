package chapterthree;

/*Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values.
For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.*/
public class LargestAbsVal {
	
	
	public static int largestAbsVal(int a,int b,int c){
		int d=Math.abs(a);
		int e=Math.abs(b);
		int f=Math.abs(c);
		if(d>=e){
			if(d>=f){
				System.out.println(d);
				return d;
			}
			else{
				System.out.println(f);
				return f;
			}
		}
			if(e>=f){
				System.out.println(e);
				return e;
			}
			else{
			return f;
			}
			
			
				
			
	
		
			
		}

}
