package chapterten;

/*Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value
in the list to the front, otherwise preserving the order of the elements. For example, if a variable called
list stores the following values: {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list); 
it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9} You may assume that the list 
stores at least one value.*/
import java.util.ArrayList;

public class MinToFront {
	public static void minToFront(ArrayList<Integer> a) { 
		int b=Integer.MAX_VALUE;
		int c=-1;
		for(int i = 0; i < a.size(); i++) {
		    if(a.get(i)<b) { 
		    	 b= a.get(i);
		            c = i;
		            
		        } 
		    } 
		    a.remove(c);
		    a.add(0, b);
		    System.out.println(a); 
		}
}
