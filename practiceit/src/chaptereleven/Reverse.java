package chaptereleven;

/*Write a method reverse that accepts a Map from integers to strings as a parameter and returns a new Map of 
 strings to integers that is the original's "reverse". The reverse of a map is defined here to be a new map 
 that uses the values from the original as its keys and the keys from the original as its values. 
 Since a map's values need not be unique but its keys must be, it is acceptable to have any of the original
  keys as the value in the result. In other words, if the original map has pairs (k1, v) and (k2, v), 
 the new map must contain either the pair (v, k1) or (v, k2).

For example, for the following map:

{42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed}
Your method could return the following new map (the order of the key/value pairs does not matter):

{Marty=3, Sue=81, Ed=29, Dave=31}*/

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Reverse {
	public static Map<String,Integer> reverse(Map<Integer,String> m2){
		Map h3=new HashMap();
		String l;
		int n;
		
		 Iterator iterator = m2.entrySet().iterator();
		 while (iterator.hasNext()) {
			 Map.Entry k= (Map.Entry)iterator.next();
			 n=(int) k.getKey();
			 l=(String) k.getValue();
			 h3.put(l,n);
		
	}
		 return h3;

}
}
