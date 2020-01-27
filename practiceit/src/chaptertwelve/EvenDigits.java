package chaptertwelve;

/*Write a method evenDigits that accepts an integer parameter n and that returns the integer formed by removing 
the odd digits from n. The following table shows several calls and their expected return values:

Call	                Valued Returned
evenDigits(8342116);	8426
evenDigits(4109);	    40
evenDigits(8);	        8
evenDigits(-34512);  	-42
evenDigits(-163505);	-60
evenDigits(3052);     	2
evenDigits(7010496);	46
evenDigits(35179);   	0
evenDigits(5307);	    0
evenDigits(7);	        0
If a negative number with even digits other than 0 is passed to the method, the result should also be negative,
as shown above when -34512 is passed. Leading zeros in the result should be ignored and if there are no even 
digits other than 0 in the number, the method should return 0, as shown in the last three outputs.*/
public class EvenDigits {
	public static int evenDigits(int a){
		
		if(a==0){
			return 0;
		}else{
			int b= a%10;
			
				System.out.println(b);		
			if(b%2==0){
				return 10* evenDigits(a/10)+b;
			}else{
				System.out.println(" else"+ a/10);
				return evenDigits(a/10);
			}
		}
	    
}
}
