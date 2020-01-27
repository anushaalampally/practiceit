package chapterfour;

/*
Write a method named daysInMonth that accepts a month (an integer between 1 and 12) as a parameter and returns the number of days in that month in this year. For example, the call daysInMonth(9) would return 30 because September has 30 days. Assume that the code is not being run during a leap year (that February always has 28 days).

Month	1 Jan	2 Feb	3 Mar	4 Apr	5 May	6 Jun	7 Jul	8 Aug	9 Sep	10 Oct	11 Nov	12 Dec
Days	31	28	31	30	31	30	31	31	30	31	30	31*/


public class DaysInMonth {
	
public static int daysInMonth(int i){
		
		switch(i){
		case 1:  return 31 ;
		case 2:  return 28;
		case 3:  return 31;
		case 4:  return 30;
		case 5:  return 31;
		case 6:  return 30;
		case 7:  return 31;
		case 8:  return 31;
		case 9 : return 30;
		case 10: return 31;
		case 11: return 30;
		case 12: return 31;
		default: return 0;
		}
}

}
