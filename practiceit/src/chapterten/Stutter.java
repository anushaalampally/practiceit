package chapterten;

/*Write a method stutter that takes an ArrayList of Strings and an integer k as parameters and that replaces 
every string with k copies of that string. For example, if the list stores the values ["how", "are", "you?"] 
		before the method is called and k is 4, it should store the values 
		["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"] 
		after the method finishes executing. If k is 0 or negative, the list should be empty after th call.*/

import java.util.ArrayList;

public class Stutter {
	public static void stutter(ArrayList<String> a,int k){
		ArrayList<String> b=new ArrayList<String>();
		
		for(int i=0;i<a.size();i++){
			for(int j=1;j<=k;j++){
				b.add(a.get(i));
			
		}
			}
		System.out.println(b);
	}
}
