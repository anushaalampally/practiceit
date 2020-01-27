package chapterseven;

/*Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower value.

For example, if the array passed contains the values {27, 15, 15, 11, 27}, your method should return 15. (Hint: You may wish to look at the Tally program from earlier in this chapter to get an idea of how to solve this problem.)*/

public class Mode {
	
	public static int[] mode(int a[]){
		int p=0;
		int j=0;
		int k[]=new int[a.length];
		if(a.length==1){
			k[0]=a[0];
			}
		
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1]){
				 k[j]=a[i];
				 j++;
				 }
			}
		
		
		return k;
		
	}

}
