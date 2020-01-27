package chapterfive;

/*Write a method called zeroDigits that accepts an integer parameter and returns the number of digits in the number that have the value 0. For example, the call zeroDigits(5024036) should return 2, and zeroDigits(743) should return 0. The call zeroDigits(0) should return 1.
		You may assume that the integer is non-negative. (We suggest you use a do/while loop in your solution.)
*/
public class ZeroDigits {
	
	public static int zeroDigits(int i){
		int j;
		int a=0;
		int c=0;
    if(i==0){
        c++;
    }
    else{
        
		while(i>0){
			j=i%10;
			a=a*10+j;
			i=i/10;
			if(j==0){
				c++;
			}
		}
    }
		return c;
	}

}
