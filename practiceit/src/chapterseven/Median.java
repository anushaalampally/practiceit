package chapterseven;

/*Write a method called median that accepts an array of integers as its argument and returns the median of the numbers in the array. The median is the number that will appear in the middle if you arrange the elements in order. Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the array are between 0 and 99 inclusive.

For example, the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5, and the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25.

(Hint: You may wish to look at the Tally program from earlier in this chapter for ideas.)*/

public class Median {
	
	public static int median(int a[]){
int temp=0;
int l;
int b = 0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				temp=a[j];
				a[j]= a[i];
				   a[i]=temp;
				  }
		}
			}
		
		l=a.length/2;
		for(int i=0;i<a.length;i++){
			if(a[l]==a[i]){
				b=a[i];
			}
			}
		
		return b;
    }

}
