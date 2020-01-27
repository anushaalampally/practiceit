package chapterseven;


/*Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true if it is a magic square. A square matrix is a magic square if it is square in shape (same number of rows as columns, and every row the same length), and all of its row, column, and diagonal sums are equal.
For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a magic square because all eight of the sums are exactly 15.*/
public class IsMagicSquare {
public static boolean isMagicSquare(int a[][]){
		
		if(a.length==0){
			return true;
		}
		for(int i=0;i<a[0].length;i++){
		if(a.length==a[i].length){
			continue;
		}else{
			return false;
		}
		}
		
		int c[]=new int[a.length];
		int d[]=new int[a.length];
		int e=0;
		int f=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				c[i]=c[i]+a[i][j];
				if(i==j){
			       	e=e+a[i][j];
					}
				if((i+j)==a.length-1){
			       	f=f+a[i][j];
					}
				}
			}	
		for(int j=0;j<a[0].length;j++){
		for(int i=0;i<a.length;i++){
				
				d[i]=d[i]+a[i][j];
				
			}
		}
		/*System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(e);
		System.out.println(f);*/
		
		int k=c[0];
		for(int i=0;i<c.length;i++){
		if(k==c[i]){
			continue;
		}else{
			return false;
		}
		}
	
		
		for(int i=0;i<d.length;i++){
			if(k==d[i]){
				continue;
			}else{
				return false;
			}
			}
		if(k==e){
			if(k==f){
				return true;
			}
		}
		
		
		
		
		return true;
		
	}
}
