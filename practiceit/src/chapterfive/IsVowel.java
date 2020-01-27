package chapterfive;

/*Write a method named isVowel that returns whether a String is a vowel (a single-letter string containing a, e, i, o, or u, case-insensitively).*/
public class IsVowel {
	
	public static Boolean isVowel(String b){
		String a[]={"a","e","i","o","u"};
		for(int i=0;i<5;i++){
			if(a[i].equalsIgnoreCase(b)){
				return true;
			}
			
			}
			
		
		return false;
		
	}

}
