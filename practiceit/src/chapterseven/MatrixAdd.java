package chapterseven;

/*Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, treats the arrays as 2D matrices and adds them, returning the result. The sum of two matrices A and B is a matrix C where for every row i and column j, Cij = Aij + Bij. You may assume that the arrays passed as parameters have the same dimensions.*/

public class MatrixAdd {
	
	
	public static int[][] matrixAdd(int a[][],int b[][]){
		    if(a.length==0){
		        return a;
		    }
				int[][] c=new int[a.length][a[0].length];
				for(int i=0;i<a.length;i++){
					for(int j=0;j<a[0].length;j++){
						c[i][j]=a[i][j]+b[i][j];
						
					}
				}
				return c;
			}

}
