package chapterten;

/*Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.
Your method should switch the order of the first two values, then switch the order of the next two, 
switch the order of the next two, and so on. For example, if the list initially stores these values: 
{"four", "score", "and", "seven", "years", "ago"} your method should switch the first pair, "four", "score",
the second pair, "and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four", 
"seven", "and", "ago", "years"}

If there are an odd number of values in the list, the final element is not moved. 
For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"} 
It would again switch pairs of values, but the final value, "hamlet" would not be moved, yielding 
this list: {"be", "to", "not", "or", "be", "to", "hamlet"}*/

import java.util.ArrayList;

public class SwapPairs {
	public static void swapPairs(ArrayList<String> a){
		
		String c;
		String d;
		for(int i=0;i<a.size()-1;){
			c=a.get(i);
			d=a.get(i+1);;
		   a.remove(i);
		   a.add(i,d);
		   a.remove(i+1);
		   a.add(i+1,c);
		   i=i+2;
		   
		}
		System.out.println(a);
}
}
