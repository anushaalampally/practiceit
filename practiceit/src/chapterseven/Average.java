package chapterseven;

/*Write a method called average that computes the average (arithmetic mean) of all elements in an array of integers and returns the answer as a double. For example, if the array passed contains the values [1, -2, 4, -4, 9, -6, 16, -8, 25, -10], the calculated average should be 2.5. Your method accepts an array of integers as its parameter and returns the average. 
You may assume that the array contains at least one element. Your method should not modify the elements of the array.*/

public class Average {
	
	public static double average(int a[]){
		double sum=0;
		int c=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			c++;
		}
		sum=sum/c;
		return sum;
		
	}

}
