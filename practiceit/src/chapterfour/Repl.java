package chapterfour;


/*Write a method named repl that accepts a String and a number of repetitions as parameters and returns the String concatenated that many times. For example, the call repl("hello", 3) returns "hellohellohello". 
If the number of repetitions is 0 or less, an empty string is returned.*/
public class Repl {
	
	
	public static String  repl(String n,int s){
		String d="";
		for(int i=1;i<=s;i++){
			d=d+n;
			
		}
		return d;
		
	}

}
