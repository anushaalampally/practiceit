package chapterseven;

/*Write a method averageLength of code that computes and returns the average String length of the elements of an array of Strings. For example, if the array contains {"belt", "hat", "jelly", "bubble gum"}, the average length returned should be 5.5. Assume that the array has at least one element.*/
public class AverageLength {
	
	public static  double averageLength(String a[]){
		int j=0;
		int t=0;
		double sum=0;
		double average=0;
		for(int i=0;i<a.length;i++){
			 t=a[i].length();
		
				
			
		 System.out.println(t);
		sum=sum+t;
		
		
		}
		 System.out.println(j);
		average=sum/a.length;
		return average;
		
	}

}
