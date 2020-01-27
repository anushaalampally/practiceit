package chaptereleven;

/*Write a method maxLength that takes a Set of strings as a parameter and that returns the length of the
longest string in the set. If your method is passed an empty set, it should return 0.*/
import java.util.Iterator;
import java.util.Set;

public class MaxLength {
	public static int maxLength(Set<String> l1){
		int j=0;
		 String k;
		
		boolean i1 = l1.isEmpty();
		if(i1==true){
			return 0;
		}
		 Iterator<String> i2 = l1.iterator();
		 while(i2.hasNext()){
			 k=i2.next();
			 int n=k.length();
			 if(j<n){
					j=n;
					 
				 }
		 }
		 return j;

}
}
