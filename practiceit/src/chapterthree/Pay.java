package chapterthree;



/*Write a method named pay that accepts a real number for a TA's salary and an integer for the number of hours the TA worked this week, and returns how much money to pay the TA. For example, the call pay(5.50, 6) should return 33.0.

The TA should receive "overtime" pay of 1 � normal salary for any hours above 8. For example, the call pay(4.00, 11) should return (4.00 * 8) + (6.00 * 3) or 50.0.*/
public class Pay {
	
	
	public static double pay(double x,double y){
		if(y>8){
			double a=(x*8)+(y-8)*x*1.5;
			return a;
		}
		else{
			double b=x*y;
			return b;
		}
	}

}
