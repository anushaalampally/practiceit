package chaptereleven;
/*
Write a method countUnique that takes a List of integers as a parameter and returns the number of unique integer values in the list.
Use a Set as auxiliary storage to help you solve this problem.

For example, if a list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method should return 5. 
		The empty list contains 0 unique values.
*/

import java.util.ArrayList;
import java.util.List;

public class CountUnique {
	public static int  countUnique(List list){
		List l2=new ArrayList();
		//System.out.println(l2.contains(list.get(1)));
		
		for(int i=0;i<list.size();i++){
			if((!l2.contains(list.get(i))))
			l2.add(list.get(i));
		}
		return l2.size();
	}
}
