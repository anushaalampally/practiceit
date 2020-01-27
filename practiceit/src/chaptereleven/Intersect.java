package chaptereleven;

/*Write a method intersect that takes two Maps of strings to integers as parameters and that returns a new map
whose contents are the intersection of the two. The intersection of two maps is defined here as the set of keys
and values that exist in both maps. So if some key K maps to value V in both the first and second map, include 
it in your result. If K does not exist as a key in both maps, or if K does not map to the same value V in both
maps, exclude that pair from your result. For example, consider the following two maps:

{Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95}
{Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}
Calling your method on the preceding maps would return the following new map (the order of the key/value pairs
		does not matter):

{Logan=62, Stefanie=80, Jeff=88, Kim=52}*/

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Intersect {
	public static Map intersect(Map<String,Integer> map1,Map<String,Integer> map2){
		Map h3=new HashMap();
		 Iterator iterator = map1.entrySet().iterator();
		 while (iterator.hasNext()) {
			 Map.Entry k= (Map.Entry)iterator.next();
			 Iterator iterator1 = map2.entrySet().iterator();
			 while (iterator1.hasNext()){
				 Map.Entry l= (Map.Entry)iterator1.next();
				 if(k.equals(l)){
					 if(k.getValue().equals(l.getValue())){
						 h3.put(k.getKey(),k.getValue());
					 }
				 }
			 }
		 }
		return h3;
	}
}
