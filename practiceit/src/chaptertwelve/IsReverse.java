package chaptertwelve;

/*Write a recursive method isReverse that accepts two strings as a parameter and returns true if the two strings 
contain the same sequence of characters as each other but in the opposite order (ignoring capitalization), 
and false otherwise. For example, the string "hello" backwards is "olleh", so a call of 
isReverse("hello", "olleh") would return true. Since the method is case-insensitive, you would also get 
		a true result from a call of isReverse("Hello", "oLLEh"). The empty string, as well as any one-letter
		string, is considered to be its own reverse. The string could contain characters other than letters, 
		such as numbers, spaces, or other punctuation; you should treat these like any other character. 
		The key aspect is that the first string has the same sequence of characters as the second string, 
		but in the opposite order, ignoring case. The table below shows more examples:

Call	                      Value Returned
isReverse("CSE143", "341esc")	true
isReverse("Madam", "MaDAm")	    true
isReverse("Q", "Q")	            true
isReverse("", "")	            true
isReverse("e via n", "N aIv E")	true
isReverse("Go! Go", "OG !OG")	true
isReverse("Obama", "McCain")	false
isReverse("banana", "nanaba")	false
isReverse("hello!!", "olleh")	false
isReverse("", "x")	            false
isReverse("madam I", "i m adam")false
isReverse("ok", "oko")	        false
You may assume that the strings passed are not null. You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion. If you like, you may declare other methods to help you solve this problem, subject to the previous rules.*/

public class IsReverse {
	public static int indexOf(String a,String b){
		int index=0;
		int i=checkstring( a, b, index);
		return i;
	}
	public static int checkstring(String a,String b,int index){
		if(a.length()<b.length()){
			return -1;
		}else if(a.length()==0||b.length()==0){
			return -1;
		}else if(a.substring(0, b.length()).equals(b)){
			return index;
		}else{
			return checkstring(a.substring(1),b.substring(0),index+1);
		}
    }
}
