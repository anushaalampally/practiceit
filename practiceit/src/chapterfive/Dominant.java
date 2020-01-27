package chapterfive;


/*Write a method dominant that accepts three integers as parameters and returns true if any one of the three integers is larger than the sum of the other two integers. The integers might be passed in any order, so the largest value could be any of the three. If no value is larger than the sum of the other two, your method should return false.

For example, the call of dominant(4, 9, 2) would return true because 9 is larger than 4 + 2. The call of dominant(5, 3, 7) would return false because none of those three numbers is larger than the sum of the others. You may assume that none of the numbers is negative.*/
public class Dominant {
	
	public static boolean dominant(int a,int b,int c){
		int arr[]={a,b,c};
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				temp=arr[j];
				arr[j]= arr[i];
				arr[i]=temp;
				  }
		}
			}
		int d=arr[0]+arr[1];
		int e=arr[2];
		if(d<e){
			return true;
		}else{
			return false;
		}
	}

}
