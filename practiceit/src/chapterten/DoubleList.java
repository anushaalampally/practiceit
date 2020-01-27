package chapterten;

/*Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string
with two of that string. For example, if the list stores the values {"how", "are", "you?"} before the method 
is called, it should store the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes
executing.
*/
import java.util.ArrayList;

public class DoubleList {
	public static void doubleList(ArrayList<String> a){
		String b;
		for(int i=0;i<=a.size()-1;){
			 b=a.get(i);
			 a.add(i+1,a.get(i));
			 i=i+2;
			}
	
	System.out.println(a);
			}
}
