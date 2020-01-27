package chapterseven;


/*Write a method isPalindrome that accepts an array of Strings as its argument and returns true if that array is a palindrome (if it reads the same forwards as backwards) and false if not. For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome, so passing that array to your method would return true. 
		Arrays with zero or one element are considered to be palindromes.*/
public class IsPalindrome {
	public static  boolean isPalindrome(String a[]){
		//System.out.println(a[0]==a[a.length-1]);
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==a[a.length-1]){
				return true;
				
			}else{
				return false;
			}
			
			}
		return true;
		
		
		}

}
