package chapterten;

/*Write a method maxLength that takes an ArrayList of Strings as a parameter and that returns the length of 
the longest string in the list. If your method is passed an empty list, it should return 0.*/

import java.util.ArrayList;

public class MaxLength {
public static int maxLength(ArrayList<String> a){
		
		int b=0;
		if(a.size()!=0){
			for(int i=0;i<a.size();i++){
				 if(a.get(i).length()>b){
	        	   b=a.get(i).length();
	        	
			}
	          
			}
			return b;
		}
		return 0;
		
	}
}
