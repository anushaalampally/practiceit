package chapterfive;

/*Write a method named firstDigit that returns the first digit of an integer. For example, firstDigit(3572) should return 3. It should work for negative numbers as well. For example, firstDigit(-947) should return 9.

Call	Value Returned
firstDigit(3572)	3
firstDigit(-947)	9
firstDigit(6)	6
firstDigit(35)	3
firstDigit(123456)	1
(Hint: Use a while loop. You may not use a String to solve this problem.)*/

public class FirstDigit {
	
	public static int firstDigit(int i){
		int j;
		i=Math.abs(i);
	     int k=0;
		while(i>0){
			j=i%10;
			i=i/10;
			k=j;
			}
	     return k;
		
		
	}

}
