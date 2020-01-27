package chapterseven;

/*Write a method called append that accepts two integer arrays as parameters and returns a new array that contains the result of appending the second array's values at the end of the first array. For example, if arrays list1 and list2 store {2, 4, 6} and {1, 2, 3, 4, 5} respectively, the call of append(list1, list2) should return a new array containing {2, 4, 6, 1, 2, 3, 4, 5}. If the call instead had been append(list2, list1), the method would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}.
*/
public class Append {
	
	public static int[] append(int[] c,int d[]){
		
		int[] e=new int[c.length+d.length];
		for(int i=0;i<c.length;i++){
		
				e[i]=c[i];
				
			
		
	}
		int k=0;
		for(int i=c.length;i<e.length;i++){
				e[i]=d[k];
				
					k++;
				}
	return e;
}

}
