package chapterseven;

/*Write a method called countInRange that accepts an array of integers, a minimum value, and a maximum value as parameters and returns the count of how many elements from the array fall between the minimum and maximum (inclusive).

For example, in the array {14, 1, 22, 17, 36, 7, -43, 5}, there are four elements whose values fall between 4 and 17.*/


public class CountInRange {
	
	public static int countInRange(int a[],int min,int max){
		int counter=0;
		for(int i=0;i<a.length;i++){
			if((a[i]>=min)&&(a[i]<=max)){
				counter++;
			}
		}
	return counter;
			
			}

}
