package chapterten;

import java.util.ArrayList;

/*Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from 
each successive pair of values the shorter string in the pair. For example, suppose that an ArrayList called
list contains the following values: {"four", "score", "and", "seven", "years", "ago"} In the first pair, "four"
and "score", the shorter string is "four". In the second pair, "and" and "seven", the shorter string is "and".
In the third pair, "years" and "ago", the shorter string is "ago". Therefore, the call: 
	removeShorterStrings(list); should remove these shorter strings, leaving the list as follows: 
		"score", "seven", "years". If there is a tie (both strings have the same length), your method 
		should remove the first string in the pair. If there is an odd number of strings in the list, the 
		final value should be kept in the list.*/

public class RemoveShorterStrings {
	public static void removeShorterStrings(ArrayList<String> a){

		if(a.size()>1){
		
		for(int i=0;i<a.size()-1;){
			if(a.get(i).length()>a.get(i+1).length()){
				a.remove(a.get(i+1));
              i=i+1;

			}else
			{
					a.remove(a.get(i));
              i=i+1;
			}
			
			}
		System.out.println(a);
	}
}
}
