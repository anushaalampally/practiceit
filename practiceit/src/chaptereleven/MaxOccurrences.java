package chaptereleven;

/*Write a method maxOccurrences that accepts a List of integers as a parameter and returns the number of times 
the most frequently occurring integer (the "mode") occurs in the list. Solve this problem using a Map as auxiliary storage. 
If the list is empty, return 0.
*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class MaxOccurrences {
	public static int maxOccurrences(List l ){
		int k;
		int p = 1;
		int m=1;
		
		 HashMap h1=new HashMap();
		 if(l.size()==0){
			 return 0;
		 }
		 for(int i=0;i<l.size();i++){
			k= (int) l.get(i);
			if(h1.get(k)!=null){
				p=(int) h1.get(k);
				h1.put(k,p+1);
				}else{
					h1.put(k,p);
				}
		 }
		
		 
		 Collection<Integer> collectionValues=h1.values();
		 ArrayList l2=new ArrayList();
		
		 for(Integer s: collectionValues){
			 l2.add(s);
				
			}
		 for(int j=0;j<l2.size();j++){
			int n= (int) l2.get(j);
			 
			 if(m<n){
				 m=n;
			 }
		 }
		 
		 return m;
		 }
}
