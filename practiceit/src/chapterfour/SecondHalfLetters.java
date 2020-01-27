package chapterfour;

public class SecondHalfLetters {
	

	
	public static int secondHalfLetters (String str){
		int counter=0;
		str=str.toLowerCase();		
		for(int i=0;i<str.length();i++){
			int p=(int)str.charAt(i);
			if(p>=110&&p<=122){
				counter++;
			}
		}
		return counter;
    }

}
