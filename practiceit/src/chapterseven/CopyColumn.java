package chapterseven;

/*Assume that a two-dimensional rectangular array of integers called matrix has been declared with six rows and eight columns. Write a for loop to copy the contents of the second column into the fifth column.*/
public class CopyColumn {
	
	public static void main(String []args){
		
		int[][]matrix={{99, 98, 97, 96, 98, 94, 93, 92},
				{0, 1, 0, 1, 1, 1, 0, 1}, 
				{9, 14, -2, 3, 14, 22, 5, 0},
				{1, 2, 3, 4, 2, 6, 7, 8},
				{10, 20, 30, 40, 20, 60, 70, 80},
				{8, 6, 4, 2, 6, 5, 3, 1}};
		
		
		for(int i=0;i<matrix .length;i++){
			for(int j=0;j<matrix [0].length;j++){
				
				if(j==4){
					matrix [i][j]=matrix[i][j-3];
				}
		
		}
			
		
	}
	}

}
