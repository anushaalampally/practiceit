package chapterseven;
/*Write a method countStrings that takes an array of Strings and a target String and returns the number of occurences target appears in the array.*/
public class CountStrings {
	public static int countStrings(String a[],String b){
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i].equals(b)){
				j++;
			}
		}
		return j;
		
	}

}
