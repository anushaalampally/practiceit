package chapterten;

/*Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that eliminates
any duplicates from the list. For example, suppose that a variable called list contains the following values: 
{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} After calling removeDuplicates(list);
the list should store the following values: {"be", "is", "not", "or", "question", "that", "the", "to"}

Because the values will be sorted, all of the duplicates will be grouped together.*/

import java.util.ArrayList;

public class RemoveDuplicates {
	public void removeDuplicates(ArrayList<String> a){
		for(int i=0;i<a.size();i++){
			for(int j=i+1;j<a.size();j++){
				if(a.get(i)==a.get(j)){
					a.remove(a.get(j));
                    j=j-1;
				}
			}
		}
		System.out.println(a);
	}
}
