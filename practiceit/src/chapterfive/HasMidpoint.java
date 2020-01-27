package chapterfive;


/*Write a method named hasMidpoint that accepts three integers as parameters and returns true if one of the integers is the midpoint between the other two integers; that is, if one integer is exactly halfway between them. Your method should return false if no such midpoint relationship exists.

The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd. You must check all cases.

Calls such as the following should return true:

hasMidpoint(4, 6, 8)
hasMidpoint(2, 10, 6)
hasMidpoint(8, 8, 8)
hasMidpoint(25, 10, -5)
Calls such as the following should return false:

hasMidpoint(3, 1, 3)
hasMidpoint(1, 3, 1)
hasMidpoint(21, 9, 58)
hasMidpoint(2, 8, 16)*/
public class HasMidpoint {

	
	public static boolean  hasMidpoint(int a,int b,int c){
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
	
		int d=arr[0]-arr[1];
		int f=arr[1]-arr[2];
		if(d==f){
			return true;
		}else
		{
			return false;
		}
		
			
	
	}
}
