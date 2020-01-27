package chaptereleven;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IsUnique {
	public static boolean isUnique(Map<String,String> map1){
		
		 Iterator iterator = map1.entrySet().iterator();
		 while (iterator.hasNext()) {
			 Map.Entry k= (Map.Entry)iterator.next();
			 Iterator iterator1 = map1.entrySet().iterator();
			 while (iterator1.hasNext()){
				 Map.Entry l= (Map.Entry)iterator1.next();
				 if(k!=l){
					 if(k.getValue().equals(l.getValue())){
						 return false;
					 }
				 }
			 }
		 }
		 return true;
	}
}
