package chaptereleven;

/*Write a method hasOdd that takes a Set of integers as a parameter and that returns true 
if the set contains at least one odd integer, and false otherwise. If passed the empty set,
your method should return false.*/
		
import java.util.Iterator;
import java.util.Set;

public class HasOdd {
	public static boolean hasOdd(Set<Integer> l1){
		 int k;
		 Iterator<Integer> i2 = l1.iterator();
		 while(i2.hasNext()){
			 k=i2.next();
			 System.out.println(k);
			 if((k%2)!=0){
			return true;
				 }
		 }
		return false;
}
}
