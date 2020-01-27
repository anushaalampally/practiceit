package chapterfour;
/*Write a method called stutter that accepts a parameter and returns the String with its characters returns repeated twice.
For example, stutter("Hello!") returns "HHeelllloo!!"*/
public class Stutter {
	
	public static String stutter (String c){
		int len= c.length();
		String repeat="";
		for(int i=0;i<len;i++){
			repeat=repeat+c.charAt(i)+c.charAt(i);
		}
		return repeat;
	}

}
