package chaptereleven;

/*Write a method countCommon that takes two Lists of integers as parameters and returns the number of unique
integers that occur in both lists. Use one or more Sets as storage to help you solve this problem.

For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other list contains the 
values [-5, 15, 2, -1, 7, 15, 36], your method should return 4 (because the elements -1, 2, 7, and 15 occur
		in both lists).
*/

import java.util.HashSet;
import java.util.List;

public class CountCommon {
	public static int  countCommon(List list,List list1){		
		int j=0;
		HashSet set1=new HashSet(list);
		HashSet set2=new HashSet(list1);			
		for(Object i:set1){			
			if((set2.contains(i))){
				j++;
			}
			
		}
		return j;
	}
}
